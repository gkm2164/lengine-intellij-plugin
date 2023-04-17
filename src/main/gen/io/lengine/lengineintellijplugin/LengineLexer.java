// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Lengine.flex

package io.lengine.lengineintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.lengine.lengineintellijplugin.psi.LengineTypes;
import com.intellij.psi.TokenType;


class LengineLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;
  public static final int STRING_VALUE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\u10df\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\0\1\6\1\7\4\10\1\11\1\12\2\10\1\0"+
    "\1\10\1\13\1\14\12\15\1\16\1\17\4\10\1\0"+
    "\2\10\1\20\27\10\1\21\1\22\1\23\1\24\1\10"+
    "\1\0\1\25\1\26\1\27\1\30\1\31\1\32\2\10"+
    "\1\33\2\10\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\10\1\43\1\44\1\45\2\10\1\46\1\10"+
    "\1\47\1\10\1\50\1\10\6\0\1\3\u01a2\0\2\3"+
    "\326\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\3\1\7\1\10\1\11\1\1\7\3\1\12\1\13"+
    "\2\14\1\0\1\15\4\0\1\16\1\17\1\3\1\20"+
    "\2\3\1\21\6\3\1\22\1\23\1\6\1\24\1\25"+
    "\1\26\2\3\1\27\4\3\1\30\2\3\1\31\10\3"+
    "\1\32\1\33\1\34\2\3\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\173\0\173\0\u0148\0\u0171\0\u019a\0\173\0\173\0\u01c3"+
    "\0\u01ec\0\u0215\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\173"+
    "\0\173\0\u030b\0\244\0\315\0\173\0\u0334\0\u035d\0\u0386"+
    "\0\u03af\0\u03d8\0\173\0\u0401\0\u011f\0\u042a\0\u0453\0\u011f"+
    "\0\u047c\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\u0549\0\173\0\173"+
    "\0\u0386\0\u03af\0\u011f\0\u011f\0\u0572\0\u059b\0\u011f\0\u05c4"+
    "\0\u05ed\0\u0616\0\u063f\0\u011f\0\u0668\0\u0691\0\u011f\0\u06ba"+
    "\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787\0\u07b0\0\u07d9\0\u011f"+
    "\0\u011f\0\u011f\0\u0802\0\u082b\0\u011f\0\u011f";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\5\5\1\6\1\7\1\10\1\11\1\12\2\10"+
    "\1\13\1\14\1\15\1\10\1\16\1\4\1\17\1\20"+
    "\3\10\1\21\1\10\1\22\1\23\1\24\1\25\4\10"+
    "\1\26\1\27\3\10\1\30\1\31\1\4\1\32\1\33"+
    "\1\5\1\33\1\5\44\4\5\5\43\4\52\0\5\5"+
    "\43\0\6\34\1\35\42\34\20\0\1\36\1\0\1\37"+
    "\36\0\1\10\2\0\4\10\1\0\1\10\4\0\22\10"+
    "\15\0\1\40\1\41\1\13\43\0\1\42\2\0\2\42"+
    "\1\10\1\42\1\0\1\42\4\0\22\42\2\0\2\15"+
    "\1\0\2\15\1\0\43\15\11\0\1\43\47\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\4\10\1\44\15\10"+
    "\12\0\1\10\2\0\4\10\1\0\1\10\4\0\11\10"+
    "\1\45\1\46\7\10\12\0\1\10\2\0\4\10\1\0"+
    "\1\10\4\0\10\10\1\47\1\50\10\10\12\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\1\51\3\10\1\52"+
    "\5\10\1\53\7\10\12\0\1\10\2\0\4\10\1\0"+
    "\1\10\4\0\12\10\1\54\7\10\12\0\1\10\2\0"+
    "\4\10\1\0\1\10\4\0\4\10\1\55\15\10\12\0"+
    "\1\10\2\0\4\10\1\0\1\10\4\0\15\10\1\56"+
    "\4\10\3\0\2\32\1\5\1\32\1\5\54\0\1\57"+
    "\47\0\1\60\2\0\4\60\1\0\1\60\4\0\22\60"+
    "\17\0\1\61\50\0\1\62\43\0\1\42\2\0\4\42"+
    "\1\0\1\42\4\0\22\42\12\0\1\10\2\0\4\10"+
    "\1\0\1\10\4\0\5\10\1\63\14\10\12\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\15\10\1\64\4\10"+
    "\12\0\1\10\2\0\4\10\1\0\1\10\4\0\13\10"+
    "\1\65\6\10\12\0\1\10\2\0\4\10\1\0\1\10"+
    "\4\0\10\10\1\66\11\10\12\0\1\10\2\0\4\10"+
    "\1\0\1\10\4\0\16\10\1\67\3\10\12\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\12\10\1\70\7\10"+
    "\12\0\1\10\2\0\4\10\1\0\1\10\4\0\3\10"+
    "\1\71\16\10\12\0\1\10\2\0\4\10\1\0\1\10"+
    "\4\0\2\10\1\72\11\10\1\73\5\10\12\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\21\10\1\74\12\0"+
    "\1\10\2\0\4\10\1\0\1\10\4\0\12\10\1\75"+
    "\7\10\12\0\1\10\2\0\4\10\1\0\1\10\4\0"+
    "\1\10\1\76\20\10\12\0\1\10\2\0\4\10\1\0"+
    "\1\10\4\0\13\10\1\77\6\10\12\0\1\10\2\0"+
    "\4\10\1\0\1\10\4\0\17\10\1\100\2\10\12\0"+
    "\1\10\2\0\4\10\1\0\1\10\4\0\12\10\1\101"+
    "\7\10\12\0\1\10\2\0\4\10\1\0\1\10\4\0"+
    "\17\10\1\102\2\10\12\0\1\10\2\0\4\10\1\0"+
    "\1\10\4\0\15\10\1\103\4\10\12\0\1\10\2\0"+
    "\4\10\1\0\1\10\4\0\3\10\1\104\16\10\12\0"+
    "\1\10\2\0\4\10\1\0\1\10\4\0\7\10\1\105"+
    "\12\10\12\0\1\10\2\0\4\10\1\0\1\10\4\0"+
    "\20\10\1\106\1\10\12\0\1\10\2\0\4\10\1\0"+
    "\1\10\4\0\6\10\1\107\13\10\12\0\1\10\2\0"+
    "\4\10\1\0\1\10\4\0\16\10\1\110\3\10\12\0"+
    "\1\10\2\0\4\10\1\0\1\10\4\0\1\111\21\10"+
    "\12\0\1\10\2\0\4\10\1\0\1\10\4\0\4\10"+
    "\1\112\15\10\12\0\1\10\2\0\4\10\1\0\1\10"+
    "\4\0\4\10\1\113\15\10\12\0\1\10\2\0\4\10"+
    "\1\0\1\10\4\0\15\10\1\114\4\10\12\0\1\10"+
    "\2\0\4\10\1\0\1\10\4\0\15\10\1\115\4\10"+
    "\12\0\1\10\2\0\4\10\1\0\1\10\4\0\4\10"+
    "\1\116\15\10\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2132];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\4\1\2\11\3\1\2\11\10\1\2\11"+
    "\2\1\1\0\1\11\4\0\1\1\1\11\13\1\2\11"+
    "\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LengineLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 31: break;
          case 2:
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 32: break;
          case 3:
            { yybegin(YYINITIAL); return LengineTypes.SYMBOL;
            }
          // fall through
          case 33: break;
          case 4:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_PARENTHESIS;
            }
          // fall through
          case 34: break;
          case 5:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_PARENTHESIS;
            }
          // fall through
          case 35: break;
          case 6:
            { yybegin(YYINITIAL); return LengineTypes.NUMBER;
            }
          // fall through
          case 36: break;
          case 7:
            { yybegin(YYINITIAL); return LengineTypes.COMMENT;
            }
          // fall through
          case 37: break;
          case 8:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACKET;
            }
          // fall through
          case 38: break;
          case 9:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACKET;
            }
          // fall through
          case 39: break;
          case 10:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACE;
            }
          // fall through
          case 40: break;
          case 11:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACE;
            }
          // fall through
          case 41: break;
          case 12:
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 42: break;
          case 13:
            { yybegin(YYINITIAL); return LengineTypes.STRING;
            }
          // fall through
          case 43: break;
          case 14:
            { yybegin(YYINITIAL); return LengineTypes.OBJECT_SYMBOL;
            }
          // fall through
          case 44: break;
          case 15:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA_PARENTHESIS;
            }
          // fall through
          case 45: break;
          case 16:
            { yybegin(YYINITIAL); return LengineTypes.FN;
            }
          // fall through
          case 46: break;
          case 17:
            { yybegin(YYINITIAL); return LengineTypes.IN;
            }
          // fall through
          case 47: break;
          case 18:
            { yybegin(YYINITIAL); return LengineTypes.COMPLEX_NUMBER_PARENTHESIS;
            }
          // fall through
          case 48: break;
          case 19:
            { yybegin(YYINITIAL); return LengineTypes.CHARACTER;
            }
          // fall through
          case 49: break;
          case 20:
            { yybegin(YYINITIAL); return LengineTypes.RATIO_NUMBER;
            }
          // fall through
          case 50: break;
          case 21:
            { yybegin(YYINITIAL); return LengineTypes.DEF;
            }
          // fall through
          case 51: break;
          case 22:
            { yybegin(YYINITIAL); return LengineTypes.FOR;
            }
          // fall through
          case 52: break;
          case 23:
            { yybegin(YYINITIAL); return LengineTypes.LET;
            }
          // fall through
          case 53: break;
          case 24:
            { yybegin(YYINITIAL); return LengineTypes.TRY;
            }
          // fall through
          case 54: break;
          case 25:
            { yybegin(YYINITIAL); return LengineTypes.LOOP;
            }
          // fall through
          case 55: break;
          case 26:
            { yybegin(YYINITIAL); return LengineTypes.IMPORT;
            }
          // fall through
          case 56: break;
          case 27:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA;
            }
          // fall through
          case 57: break;
          case 28:
            { yybegin(YYINITIAL); return LengineTypes.MODULE;
            }
          // fall through
          case 58: break;
          case 29:
            { yybegin(YYINITIAL); return LengineTypes.RECOVER;
            }
          // fall through
          case 59: break;
          case 30:
            { yybegin(YYINITIAL); return LengineTypes.REQUIRE;
            }
          // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
