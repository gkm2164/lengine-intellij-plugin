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
LAZY_PARENTHESIS = "#("
COMPLEX_NUMBER_PARENTHESIS = "#C("
LAMBDA_PARENTHESIS = "^("
WHITE_SPACE = [\ \n\t\f]
END_OF_LINE_COMMENT = ";"[^\r\n]*
MODULE="module"
IMPORT="import"
REQUIRE="require"
EXPORT="export"
IMPORT="import"
NATIVE="native"
VAR="var"
FOR="for"
WHEN="when"
OTHERWISE="otherwise"
IN="in"
DEF="def"
LET="let"
LOOP="loop"
FN="fn"
LAMBDA="lambda"
TRY="try"
RECOVER="recover"
DO="do"
RETURN="return"
IF="if"
INTEGER = [0-9]+
SLASH="/"
RATIO_NUMBER = {INTEGER}("/"{INTEGER})
NUMBER = {INTEGER}(\.{INTEGER})?
OBJECT_SYMBOL=":"([$.a-zA-Z_\-+/*%<>=?:'&|~][$.a-zA-Z0-9_\-+/*%<>=?:'&|~]*\*?)
SYMBOL=([$.a-zA-Z_\-+/*%<>=?:'&|~][$.a-zA-Z0-9_\-+/*%<>=?:'&|~]*\*?)
DOUBLE_QUOTE=\"
LEFT_BRACKET="["
RIGHT_BRACKET="]"
LEFT_BRACE="{"
RIGHT_BRACE="}"
SPECIAL_CHARACTER = "#\\"("Backspace"|"Tab"|"Linefeed"|"Page"|"Space"|"Return"|"Rubout")
CHARACTER = "#\\"[$.a-zA-Z_\-+/*%<>=?:'\"&|~0-9{}(),\[\]]
SPECIAL_NUMBERS = "#"[0-9]+r[0-9a-zA-Z]+
ESCAPE=\
ANY_CHAR=.

%state WAITING_VALUE
%state STRING_VALUE
%state STRING_ESCAPE
%%

<YYINITIAL> {LEFT_PARENTHESIS}                              { yybegin(YYINITIAL); return LengineTypes.LEFT_PARENTHESIS; }
<YYINITIAL> {RIGHT_PARENTHESIS}                             { yybegin(YYINITIAL); return LengineTypes.RIGHT_PARENTHESIS; }
<YYINITIAL> {LEFT_BRACKET}                                  { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACKET; }
<YYINITIAL> {RIGHT_BRACKET}                                 { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACKET; }
<YYINITIAL> {LEFT_BRACE}                                    { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACE; }
<YYINITIAL> {RIGHT_BRACE}                                   { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACE; }
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return LengineTypes.COMMENT; }
<YYINITIAL> {MODULE}                                        { yybegin(YYINITIAL); return LengineTypes.MODULE; }
<YYINITIAL> {REQUIRE}                                       { yybegin(YYINITIAL); return LengineTypes.REQUIRE; }
<YYINITIAL> {IMPORT}                                        { yybegin(YYINITIAL); return LengineTypes.IMPORT; }
<YYINITIAL> {FN}                                            { yybegin(YYINITIAL); return LengineTypes.FN; }
<YYINITIAL> {LOOP}                                          { yybegin(YYINITIAL); return LengineTypes.LOOP; }
<YYINITIAL> {FOR}                                           { yybegin(YYINITIAL); return LengineTypes.FOR; }
<YYINITIAL> {WHEN}                                          { yybegin(YYINITIAL); return LengineTypes.WHEN; }
<YYINITIAL> {OTHERWISE}                                     { yybegin(YYINITIAL); return LengineTypes.OTHERWISE; }
<YYINITIAL> {IN}                                            { yybegin(YYINITIAL); return LengineTypes.IN; }
<YYINITIAL> {LET}                                           { yybegin(YYINITIAL); return LengineTypes.LET; }
<YYINITIAL> {DEF}                                           { yybegin(YYINITIAL); return LengineTypes.DEF; }
<YYINITIAL> {LAMBDA}                                        { yybegin(YYINITIAL); return LengineTypes.LAMBDA; }
<YYINITIAL> {TRY}                                           { yybegin(YYINITIAL); return LengineTypes.TRY; }
<YYINITIAL> {DO}                                            { yybegin(YYINITIAL); return LengineTypes.DO; }
<YYINITIAL> {RETURN}                                        { yybegin(YYINITIAL); return LengineTypes.RETURN; }
<YYINITIAL> {IF}                                            { yybegin(YYINITIAL); return LengineTypes.IF; }
<YYINITIAL> {RECOVER}                                       { yybegin(YYINITIAL); return LengineTypes.RECOVER; }
<YYINITIAL> {OBJECT_SYMBOL}                                 { yybegin(YYINITIAL); return LengineTypes.OBJECT_SYMBOL; }
<YYINITIAL> {COMPLEX_NUMBER_PARENTHESIS}                    { yybegin(YYINITIAL); return LengineTypes.COMPLEX_NUMBER_PARENTHESIS; }
<YYINITIAL> {LAZY_PARENTHESIS}                              { yybegin(YYINITIAL); return LengineTypes.LAZY_PARENTHESIS; }
<YYINITIAL> {LAMBDA_PARENTHESIS}                            { yybegin(YYINITIAL); return LengineTypes.LAMBDA_PARENTHESIS; }
<YYINITIAL> {RATIO_NUMBER}                                  { yybegin(YYINITIAL); return LengineTypes.RATIO_NUMBER; }
<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return LengineTypes.NUMBER; }
<YYINITIAL> {SPECIAL_NUMBERS}                               { yybegin(YYINITIAL); return LengineTypes.NUMBER; }
<YYINITIAL> {DOUBLE_QUOTE}                                  { yybegin(STRING_VALUE); return LengineTypes.STRING_CONT; }
<YYINITIAL> {SPECIAL_CHARACTER}                             { yybegin(YYINITIAL); return LengineTypes.CHARACTER; }
<YYINITIAL> {CHARACTER}                                     { yybegin(YYINITIAL); return LengineTypes.CHARACTER; }
<YYINITIAL> {EXPORT}                                        { yybegin(YYINITIAL); return LengineTypes.EXPORT; }
<YYINITIAL> {IMPORT}                                        { yybegin(YYINITIAL); return LengineTypes.IMPORT; }
<YYINITIAL> {NATIVE}                                        { yybegin(YYINITIAL); return LengineTypes.NATIVE; }
<YYINITIAL> {VAR}                                           { yybegin(YYINITIAL); return LengineTypes.VAR; }
<YYINITIAL> {SYMBOL}                                        { yybegin(YYINITIAL); return LengineTypes.SYMBOL; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<STRING_VALUE>  {ESCAPE}                                     { yybegin(STRING_ESCAPE); return LengineTypes.STRING_CONT; }
<STRING_VALUE>  {DOUBLE_QUOTE}                               { yybegin(YYINITIAL); return LengineTypes.STRING; }
<STRING_VALUE>  {ANY_CHAR}                                   { yybegin(STRING_VALUE); return LengineTypes.STRING_CONT; }

<STRING_ESCAPE> {ANY_CHAR}                                   { yybegin(STRING_VALUE); return LengineTypes.STRING_CONT; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
