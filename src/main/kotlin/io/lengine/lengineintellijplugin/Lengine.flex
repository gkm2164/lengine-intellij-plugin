package io.lengine.lengineintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.lengine.lengineintellijplugin.psi.LengineTypes;
import com.intellij.psi.TokenType;

%%

%class LengineLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

CRLF=\R
LEFT_PARENTHESIS = "("
RIGHT_PARENTHESIS = ")"
WHITE_SPACE = [\ \n\t\f]
FIRST_VALUE_CHARACTER = [^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER = [^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT = ";"[^\r\n]*
SEPARATOR = [:=]
KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "

%state WAITING_VALUE
%state STATEMENT_CTX

%%

<YYINITIAL> {LEFT_PARENTHESIS}                              { yybegin(STATEMENT_CTX); return LengineTypes.SEPARATOR; }

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return LengineTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return LengineTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return LengineTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return LengineTypes.VALUE; }

<STATEMENT_CTX> {KEY_CHARACTER}+                            { yybegin(STATEMENT_CTX); return LengineTypes.KEY; }

<STATEMENT_CTX> {RIGHT_PARENTHESIS}                         { yybegin(YYINITIAL); return LengineTypes.SEPARATOR; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
