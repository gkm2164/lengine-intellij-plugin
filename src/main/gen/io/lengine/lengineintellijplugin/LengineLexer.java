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
  public static final int STRING_ESCAPE = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

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
    "\1\0\1\6\1\7\4\10\1\11\1\12\2\10\1\13"+
    "\1\10\1\14\1\15\12\16\1\17\1\20\4\10\1\0"+
    "\1\10\1\21\1\22\10\10\1\23\3\10\1\24\1\10"+
    "\1\25\1\26\1\27\6\10\1\30\1\31\1\32\1\33"+
    "\1\10\1\0\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\10\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\61\1\62\1\63\1\10\1\64\1\10\1\65\1\10"+
    "\6\0\1\3\u01a2\0\2\3\326\0\u0100\66";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
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
    "\4\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\4\1\10\1\11\1\12\1\1\14\4\1\13"+
    "\1\14\2\15\1\3\1\16\1\17\1\20\4\0\1\21"+
    "\1\22\1\4\1\23\1\4\1\24\1\4\1\25\1\4"+
    "\1\26\12\4\1\27\7\30\1\7\1\31\1\32\1\4"+
    "\1\33\2\4\1\34\7\4\1\35\1\36\1\4\7\0"+
    "\3\4\1\37\6\4\1\40\6\0\11\4\4\0\1\41"+
    "\1\42\1\43\1\44\1\45\3\4\1\46\4\0\1\4"+
    "\1\47\1\50\1\0\1\4\1\0\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
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
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\334\0\u014a"+
    "\0\u0181\0\334\0\334\0\u01b8\0\u01ef\0\u0226\0\334\0\334"+
    "\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339\0\u0370\0\u03a7\0\u03de"+
    "\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1\0\334\0\334\0\u0528"+
    "\0\u0113\0\u0113\0\334\0\334\0\334\0\u055f\0\u0596\0\u05cd"+
    "\0\u0604\0\u063b\0\334\0\u0672\0\u0181\0\u06a9\0\u0181\0\u06e0"+
    "\0\u0181\0\u0717\0\u0181\0\u074e\0\u0785\0\u07bc\0\u07f3\0\u082a"+
    "\0\u0861\0\u0898\0\u08cf\0\u0906\0\u093d\0\334\0\334\0\u0974"+
    "\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u0a87\0\u05cd\0\u0604\0\u0181"+
    "\0\u0abe\0\u0181\0\u0af5\0\u0b2c\0\u0181\0\u0b63\0\u0b9a\0\u0bd1"+
    "\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0181\0\u0181\0\u0ce4\0\u0d1b"+
    "\0\u0d52\0\u0d89\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3"+
    "\0\u0f0a\0\u0181\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054"+
    "\0\u0181\0\u108b\0\u10c2\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5"+
    "\0\u120c\0\u1243\0\u127a\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d"+
    "\0\u13c4\0\u13fb\0\u1432\0\u1469\0\u0181\0\u0181\0\u0181\0\u0181"+
    "\0\u0181\0\u14a0\0\u14d7\0\u150e\0\u0181\0\u0a50\0\u1545\0\u157c"+
    "\0\u15b3\0\u15ea\0\u0181\0\u0181\0\u1621\0\u1658\0\u168f\0\u0181";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
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
    "\1\5\5\6\1\7\1\10\1\11\1\12\1\13\1\5"+
    "\2\11\1\14\1\15\1\16\7\11\1\17\1\5\1\20"+
    "\1\21\3\11\1\22\1\23\1\24\2\11\1\25\1\11"+
    "\1\26\1\27\1\30\1\31\2\11\1\32\1\11\1\33"+
    "\1\11\1\34\1\35\2\11\1\36\1\37\2\5\1\40"+
    "\1\41\1\6\1\41\1\6\61\5\1\7\1\42\4\6"+
    "\1\43\22\7\1\44\34\7\1\5\1\7\1\42\4\6"+
    "\60\7\1\5\70\0\5\6\72\0\1\45\10\0\1\46"+
    "\6\0\1\47\45\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\30\11\17\0\1\50\1\51\1\14\60\0\1\52"+
    "\3\0\2\52\1\11\1\52\1\0\7\52\4\0\30\52"+
    "\3\0\2\16\1\0\2\16\1\0\61\16\11\0\1\53"+
    "\65\0\1\11\3\0\4\11\1\0\7\11\4\0\4\11"+
    "\1\54\10\11\1\55\12\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\26\11\1\56\1\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\14\11\1\57\1\60"+
    "\12\11\13\0\1\11\3\0\4\11\1\0\7\11\4\0"+
    "\5\11\1\61\5\11\1\62\1\63\13\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\1\64\3\11\1\65"+
    "\10\11\1\66\12\11\13\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\15\11\1\67\12\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\1\70\27\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\22\11\1\71\5\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\4\11"+
    "\1\72\23\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\20\11\1\73\7\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\1\74\27\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\7\11\1\75\20\11\4\0"+
    "\2\40\1\6\1\40\1\6\72\0\1\76\63\0\1\77"+
    "\1\0\10\77\1\0\1\100\1\77\1\101\1\102\1\103"+
    "\1\104\1\105\1\77\1\0\1\77\1\0\32\77\17\0"+
    "\1\106\66\0\1\107\60\0\1\52\3\0\4\52\1\0"+
    "\7\52\4\0\30\52\13\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\5\11\1\110\22\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\16\11\1\111\11\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\20\11\1\112"+
    "\7\11\13\0\1\11\3\0\4\11\1\0\7\11\4\0"+
    "\16\11\1\113\11\11\13\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\13\11\1\114\14\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\22\11\1\115\5\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\15\11\1\116"+
    "\12\11\13\0\1\11\3\0\4\11\1\0\7\11\4\0"+
    "\3\11\1\117\24\11\13\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\22\11\1\120\5\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\7\11\1\121\20\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\2\11\1\122"+
    "\14\11\1\123\2\11\1\124\5\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\27\11\1\125\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\20\11\1\126\7\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\4\11"+
    "\1\127\23\11\37\0\1\130\76\0\1\131\56\0\1\132"+
    "\72\0\1\133\16\0\1\134\61\0\1\135\50\0\1\136"+
    "\42\0\1\11\3\0\4\11\1\0\7\11\4\0\15\11"+
    "\1\137\12\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\15\11\1\140\12\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\1\11\1\141\26\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\16\11\1\142\11\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\23\11"+
    "\1\143\4\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\10\11\1\144\17\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\4\11\1\145\23\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\15\11\1\146\12\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\23\11"+
    "\1\147\4\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\23\11\1\150\4\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\14\11\1\151\13\11\41\0\1\152"+
    "\100\0\1\153\60\0\1\154\102\0\1\155\45\0\1\156"+
    "\65\0\1\157\67\0\1\77\41\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\20\11\1\160\7\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\20\11\1\161\7\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\3\11"+
    "\1\162\24\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\12\11\1\163\15\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\24\11\1\164\3\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\20\11\1\165\7\11"+
    "\13\0\1\11\3\0\4\11\1\0\7\11\4\0\24\11"+
    "\1\166\3\11\13\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\10\11\1\167\17\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\20\11\1\170\7\11\50\0\1\171"+
    "\61\0\1\172\66\0\1\77\105\0\1\173\60\0\1\174"+
    "\53\0\1\154\40\0\1\11\3\0\4\11\1\0\7\11"+
    "\4\0\22\11\1\175\5\11\13\0\1\11\3\0\4\11"+
    "\1\0\7\11\4\0\22\11\1\176\5\11\13\0\1\11"+
    "\3\0\4\11\1\0\7\11\4\0\1\177\27\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\4\11\1\200"+
    "\23\11\13\0\1\11\3\0\4\11\1\0\7\11\4\0"+
    "\4\11\1\201\23\11\13\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\25\11\1\202\2\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\4\11\1\203\23\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\20\11\1\204"+
    "\7\11\13\0\1\11\3\0\4\11\1\0\7\11\4\0"+
    "\14\11\1\205\13\11\60\0\1\206\52\0\1\207\101\0"+
    "\1\210\71\0\1\211\17\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\10\11\1\212\17\11\13\0\1\11\3\0"+
    "\4\11\1\0\7\11\4\0\20\11\1\213\7\11\13\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\4\11\1\214"+
    "\23\11\43\0\1\215\76\0\1\77\74\0\1\77\20\0"+
    "\1\11\3\0\4\11\1\0\7\11\4\0\21\11\1\216"+
    "\6\11\43\0\1\217\36\0\1\11\3\0\4\11\1\0"+
    "\7\11\4\0\4\11\1\220\23\11\42\0\1\77\27\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5830];
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
    "\4\0\1\11\1\1\1\11\2\1\2\11\3\1\2\11"+
    "\15\1\2\11\3\1\3\11\4\0\1\1\1\11\22\1"+
    "\2\11\30\1\7\0\13\1\6\0\11\1\4\0\11\1"+
    "\4\0\3\1\1\0\1\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
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
          case 42: break;
          case 2:
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 43: break;
          case 3:
            { yybegin(STRING_VALUE); return LengineTypes.STRING_CONT;
            }
          // fall through
          case 44: break;
          case 4:
            { yybegin(YYINITIAL); return LengineTypes.SYMBOL;
            }
          // fall through
          case 45: break;
          case 5:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_PARENTHESIS;
            }
          // fall through
          case 46: break;
          case 6:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_PARENTHESIS;
            }
          // fall through
          case 47: break;
          case 7:
            { yybegin(YYINITIAL); return LengineTypes.NUMBER;
            }
          // fall through
          case 48: break;
          case 8:
            { yybegin(YYINITIAL); return LengineTypes.COMMENT;
            }
          // fall through
          case 49: break;
          case 9:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACKET;
            }
          // fall through
          case 50: break;
          case 10:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACKET;
            }
          // fall through
          case 51: break;
          case 11:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACE;
            }
          // fall through
          case 52: break;
          case 12:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACE;
            }
          // fall through
          case 53: break;
          case 13:
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 54: break;
          case 14:
            { yybegin(YYINITIAL); return LengineTypes.STRING;
            }
          // fall through
          case 55: break;
          case 15:
            { yybegin(STRING_ESCAPE); return LengineTypes.STRING_CONT;
            }
          // fall through
          case 56: break;
          case 16:
            { yybegin(YYINITIAL); return LengineTypes.LAZY_PARENTHESIS;
            }
          // fall through
          case 57: break;
          case 17:
            { yybegin(YYINITIAL); return LengineTypes.OBJECT_SYMBOL;
            }
          // fall through
          case 58: break;
          case 18:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA_PARENTHESIS;
            }
          // fall through
          case 59: break;
          case 19:
            { yybegin(YYINITIAL); return LengineTypes.DO;
            }
          // fall through
          case 60: break;
          case 20:
            { yybegin(YYINITIAL); return LengineTypes.FN;
            }
          // fall through
          case 61: break;
          case 21:
            { yybegin(YYINITIAL); return LengineTypes.IF;
            }
          // fall through
          case 62: break;
          case 22:
            { yybegin(YYINITIAL); return LengineTypes.IN;
            }
          // fall through
          case 63: break;
          case 23:
            { yybegin(YYINITIAL); return LengineTypes.COMPLEX_NUMBER_PARENTHESIS;
            }
          // fall through
          case 64: break;
          case 24:
            { yybegin(YYINITIAL); return LengineTypes.CHARACTER;
            }
          // fall through
          case 65: break;
          case 25:
            { yybegin(YYINITIAL); return LengineTypes.RATIO_NUMBER;
            }
          // fall through
          case 66: break;
          case 26:
            { yybegin(YYINITIAL); return LengineTypes.DEF;
            }
          // fall through
          case 67: break;
          case 27:
            { yybegin(YYINITIAL); return LengineTypes.FOR;
            }
          // fall through
          case 68: break;
          case 28:
            { yybegin(YYINITIAL); return LengineTypes.LET;
            }
          // fall through
          case 69: break;
          case 29:
            { yybegin(YYINITIAL); return LengineTypes.TRY;
            }
          // fall through
          case 70: break;
          case 30:
            { yybegin(YYINITIAL); return LengineTypes.VAR;
            }
          // fall through
          case 71: break;
          case 31:
            { yybegin(YYINITIAL); return LengineTypes.LOOP;
            }
          // fall through
          case 72: break;
          case 32:
            { yybegin(YYINITIAL); return LengineTypes.WHEN;
            }
          // fall through
          case 73: break;
          case 33:
            { yybegin(YYINITIAL); return LengineTypes.EXPORT;
            }
          // fall through
          case 74: break;
          case 34:
            { yybegin(YYINITIAL); return LengineTypes.IMPORT;
            }
          // fall through
          case 75: break;
          case 35:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA;
            }
          // fall through
          case 76: break;
          case 36:
            { yybegin(YYINITIAL); return LengineTypes.MODULE;
            }
          // fall through
          case 77: break;
          case 37:
            { yybegin(YYINITIAL); return LengineTypes.NATIVE;
            }
          // fall through
          case 78: break;
          case 38:
            { yybegin(YYINITIAL); return LengineTypes.RETURN;
            }
          // fall through
          case 79: break;
          case 39:
            { yybegin(YYINITIAL); return LengineTypes.RECOVER;
            }
          // fall through
          case 80: break;
          case 40:
            { yybegin(YYINITIAL); return LengineTypes.REQUIRE;
            }
          // fall through
          case 81: break;
          case 41:
            { yybegin(YYINITIAL); return LengineTypes.OTHERWISE;
            }
          // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
