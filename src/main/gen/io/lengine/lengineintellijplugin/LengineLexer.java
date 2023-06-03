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
    "\1\21\1\22\1\23\10\21\1\24\3\21\1\25\1\21"+
    "\1\26\1\27\1\30\6\21\1\31\1\32\1\33\1\34"+
    "\1\10\1\0\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\21\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\1\64\1\21\1\65\1\10\1\66\1\10"+
    "\6\0\1\3\u01a2\0\2\3\326\0\u0100\67";

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
    "\1\7\1\4\1\10\1\11\1\12\1\1\15\4\1\13"+
    "\1\14\2\15\1\3\1\16\1\17\1\20\5\0\1\21"+
    "\1\22\2\4\1\23\2\4\1\24\1\4\1\25\1\4"+
    "\1\26\12\4\1\0\1\27\7\30\1\7\1\31\1\4"+
    "\1\32\2\4\1\33\2\4\1\34\10\4\1\35\1\36"+
    "\1\4\1\7\7\0\1\37\6\4\1\40\6\4\1\41"+
    "\1\42\6\0\3\4\1\43\10\4\4\0\2\4\1\44"+
    "\1\45\1\46\1\47\1\50\3\4\1\51\4\0\1\52"+
    "\2\4\1\53\1\54\1\0\1\55\1\4\1\0\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
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
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\340\0\u0150"+
    "\0\u0188\0\340\0\340\0\u01c0\0\u01f8\0\u0230\0\340\0\340"+
    "\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0"+
    "\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508\0\u0540\0\340\0\340"+
    "\0\u0578\0\u0118\0\u0118\0\340\0\340\0\340\0\u05b0\0\u05e8"+
    "\0\u0620\0\u0658\0\u0690\0\u06c8\0\340\0\u0700\0\u0738\0\u0188"+
    "\0\u0770\0\u07a8\0\u0188\0\u07e0\0\u0188\0\u0818\0\u0188\0\u0850"+
    "\0\u0888\0\u08c0\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10"+
    "\0\u0a48\0\u0a80\0\340\0\340\0\u0ab8\0\u0af0\0\u0b28\0\u0b60"+
    "\0\u0b98\0\u0bd0\0\u0658\0\u0690\0\u0c08\0\u0c40\0\u0c78\0\u0cb0"+
    "\0\u0188\0\u0ce8\0\u0d20\0\u0188\0\u0d58\0\u0d90\0\u0dc8\0\u0e00"+
    "\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0188\0\u0188\0\u0f18\0\u0a80"+
    "\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u0188"+
    "\0\u10d8\0\u1110\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u0188\0\u1228"+
    "\0\u1260\0\u1298\0\u12d0\0\u1308\0\u1340\0\u0188\0\u0188\0\u1378"+
    "\0\u13b0\0\u13e8\0\u1420\0\u1458\0\u1490\0\u14c8\0\u1500\0\u1538"+
    "\0\u0188\0\u1570\0\u15a8\0\u15e0\0\u1618\0\u1650\0\u1688\0\u16c0"+
    "\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8\0\u1810\0\u1848\0\u0188"+
    "\0\u0188\0\u0188\0\u0188\0\u0188\0\u1880\0\u18b8\0\u18f0\0\u0188"+
    "\0\u0b98\0\u1928\0\u1960\0\u1998\0\u0188\0\u19d0\0\u1a08\0\u0188"+
    "\0\u0188\0\u1a40\0\u0188\0\u1a78\0\u1ab0\0\u0188";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
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
    "\1\5\5\6\1\7\1\10\1\11\1\12\1\13\3\11"+
    "\1\14\1\15\1\16\10\11\1\17\1\5\1\20\1\21"+
    "\2\11\1\22\1\23\1\24\1\25\2\11\1\26\1\11"+
    "\1\27\1\30\1\31\1\32\2\11\1\33\1\11\1\34"+
    "\1\11\1\35\1\36\2\11\1\37\1\40\2\5\1\41"+
    "\1\42\1\6\1\42\1\6\62\5\1\7\1\43\4\6"+
    "\1\44\23\7\1\45\34\7\1\5\1\7\1\43\4\6"+
    "\61\7\1\5\71\0\5\6\73\0\1\46\4\0\1\47"+
    "\4\0\1\50\6\0\1\51\45\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\30\11\17\0\1\52\1\53\1\14"+
    "\61\0\1\54\2\0\1\11\2\54\1\11\1\54\1\0"+
    "\10\54\4\0\30\54\3\0\2\16\1\0\2\16\1\0"+
    "\62\16\11\0\1\55\66\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\1\56\27\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\4\11\1\57\10\11\1\60\12\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\26\11"+
    "\1\61\1\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\1\62\13\11\1\63\1\64\12\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\5\11\1\65\5\11"+
    "\1\66\1\67\13\11\13\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\1\70\3\11\1\71\10\11\1\72\12\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\15\11"+
    "\1\73\12\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\1\74\27\11\13\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\22\11\1\75\5\11\13\0\1\11\2\0"+
    "\5\11\1\0\10\11\4\0\4\11\1\76\23\11\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\20\11\1\77"+
    "\7\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\1\100\27\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\7\11\1\101\20\11\4\0\2\41\1\6\1\41"+
    "\1\6\100\0\1\47\36\0\1\102\23\0\1\103\64\0"+
    "\1\104\1\0\10\104\1\0\1\104\1\105\1\104\1\106"+
    "\1\107\1\110\1\111\1\112\1\104\1\0\1\104\1\0"+
    "\32\104\17\0\1\113\67\0\1\114\61\0\1\54\2\0"+
    "\1\11\4\54\1\0\10\54\4\0\30\54\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\21\11\1\115\6\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\5\11"+
    "\1\116\22\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\16\11\1\117\11\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\12\11\1\120\15\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\20\11\1\121\7\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\16\11"+
    "\1\122\11\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\13\11\1\123\14\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\22\11\1\124\5\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\15\11\1\125\12\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\3\11"+
    "\1\126\24\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\22\11\1\127\5\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\7\11\1\130\20\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\2\11\1\131\14\11"+
    "\1\132\2\11\1\133\5\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\23\11\1\134\3\11\1\135\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\20\11\1\136"+
    "\7\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\4\11\1\137\23\11\21\0\1\140\2\0\10\140\4\0"+
    "\30\140\40\0\1\141\77\0\1\142\57\0\1\143\73\0"+
    "\1\144\16\0\1\145\62\0\1\146\51\0\1\147\42\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\4\11\1\150"+
    "\23\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\1\151\12\11\1\152\14\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\15\11\1\153\12\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\21\11\1\154\6\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\15\11"+
    "\1\155\12\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\1\11\1\156\26\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\16\11\1\157\11\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\23\11\1\160\4\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\10\11"+
    "\1\161\17\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\4\11\1\162\23\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\15\11\1\163\12\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\23\11\1\164\4\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\23\11"+
    "\1\165\4\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\4\11\1\166\23\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\14\11\1\167\13\11\42\0\1\170"+
    "\101\0\1\171\61\0\1\172\103\0\1\173\46\0\1\174"+
    "\66\0\1\175\70\0\1\104\41\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\23\11\1\176\4\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\1\177\27\11\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\20\11\1\200"+
    "\7\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\4\11\1\201\23\11\13\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\20\11\1\202\7\11\13\0\1\11\2\0"+
    "\5\11\1\0\10\11\4\0\3\11\1\203\24\11\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\12\11\1\204"+
    "\15\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\24\11\1\205\3\11\13\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\20\11\1\206\7\11\13\0\1\11\2\0"+
    "\5\11\1\0\10\11\4\0\24\11\1\207\3\11\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\10\11\1\210"+
    "\17\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\20\11\1\211\7\11\51\0\1\212\62\0\1\213\67\0"+
    "\1\104\106\0\1\214\61\0\1\215\54\0\1\172\40\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\12\11\1\216"+
    "\15\11\13\0\1\11\2\0\5\11\1\0\10\11\4\0"+
    "\2\11\1\217\25\11\13\0\1\11\2\0\5\11\1\0"+
    "\10\11\4\0\22\11\1\220\5\11\13\0\1\11\2\0"+
    "\5\11\1\0\10\11\4\0\22\11\1\221\5\11\13\0"+
    "\1\11\2\0\5\11\1\0\10\11\4\0\1\222\27\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\4\11"+
    "\1\223\23\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\4\11\1\224\23\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\25\11\1\225\2\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\4\11\1\226\23\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\20\11"+
    "\1\227\7\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\14\11\1\230\13\11\61\0\1\231\53\0\1\232"+
    "\102\0\1\233\72\0\1\234\17\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\22\11\1\235\5\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\20\11\1\236\7\11"+
    "\13\0\1\11\2\0\5\11\1\0\10\11\4\0\10\11"+
    "\1\237\17\11\13\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\20\11\1\240\7\11\13\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\4\11\1\241\23\11\44\0\1\242"+
    "\77\0\1\104\75\0\1\104\20\0\1\11\2\0\5\11"+
    "\1\0\10\11\4\0\15\11\1\243\12\11\13\0\1\11"+
    "\2\0\5\11\1\0\10\11\4\0\21\11\1\244\6\11"+
    "\44\0\1\245\36\0\1\11\2\0\5\11\1\0\10\11"+
    "\4\0\4\11\1\246\23\11\43\0\1\104\27\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[6888];
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
    "\16\1\2\11\3\1\3\11\5\0\1\1\1\11\24\1"+
    "\1\0\2\11\34\1\7\0\20\1\6\0\14\1\4\0"+
    "\13\1\4\0\5\1\1\0\2\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
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
          case 47: break;
          case 2:
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 48: break;
          case 3:
            { yybegin(STRING_VALUE);
            }
          // fall through
          case 49: break;
          case 4:
            { yybegin(YYINITIAL); return LengineTypes.SYMBOL;
            }
          // fall through
          case 50: break;
          case 5:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_PARENTHESIS;
            }
          // fall through
          case 51: break;
          case 6:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_PARENTHESIS;
            }
          // fall through
          case 52: break;
          case 7:
            { yybegin(YYINITIAL); return LengineTypes.NUMBER;
            }
          // fall through
          case 53: break;
          case 8:
            { yybegin(YYINITIAL); return LengineTypes.COMMENT;
            }
          // fall through
          case 54: break;
          case 9:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACKET;
            }
          // fall through
          case 55: break;
          case 10:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACKET;
            }
          // fall through
          case 56: break;
          case 11:
            { yybegin(YYINITIAL); return LengineTypes.LEFT_BRACE;
            }
          // fall through
          case 57: break;
          case 12:
            { yybegin(YYINITIAL); return LengineTypes.RIGHT_BRACE;
            }
          // fall through
          case 58: break;
          case 13:
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          // fall through
          case 59: break;
          case 14:
            { yybegin(YYINITIAL); return LengineTypes.STRING;
            }
          // fall through
          case 60: break;
          case 15:
            { yybegin(STRING_ESCAPE);
            }
          // fall through
          case 61: break;
          case 16:
            { yybegin(YYINITIAL); return LengineTypes.LAZY_PARENTHESIS;
            }
          // fall through
          case 62: break;
          case 17:
            { yybegin(YYINITIAL); return LengineTypes.OBJECT_SYMBOL;
            }
          // fall through
          case 63: break;
          case 18:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA_PARENTHESIS;
            }
          // fall through
          case 64: break;
          case 19:
            { yybegin(YYINITIAL); return LengineTypes.DO;
            }
          // fall through
          case 65: break;
          case 20:
            { yybegin(YYINITIAL); return LengineTypes.FN;
            }
          // fall through
          case 66: break;
          case 21:
            { yybegin(YYINITIAL); return LengineTypes.IF;
            }
          // fall through
          case 67: break;
          case 22:
            { yybegin(YYINITIAL); return LengineTypes.IN;
            }
          // fall through
          case 68: break;
          case 23:
            { yybegin(YYINITIAL); return LengineTypes.COMPLEX_NUMBER_PARENTHESIS;
            }
          // fall through
          case 69: break;
          case 24:
            { yybegin(YYINITIAL); return LengineTypes.CHARACTER;
            }
          // fall through
          case 70: break;
          case 25:
            { yybegin(YYINITIAL); return LengineTypes.RATIO_NUMBER;
            }
          // fall through
          case 71: break;
          case 26:
            { yybegin(YYINITIAL); return LengineTypes.DEF;
            }
          // fall through
          case 72: break;
          case 27:
            { yybegin(YYINITIAL); return LengineTypes.FOR;
            }
          // fall through
          case 73: break;
          case 28:
            { yybegin(YYINITIAL); return LengineTypes.LET;
            }
          // fall through
          case 74: break;
          case 29:
            { yybegin(YYINITIAL); return LengineTypes.TRY;
            }
          // fall through
          case 75: break;
          case 30:
            { yybegin(YYINITIAL); return LengineTypes.VAR;
            }
          // fall through
          case 76: break;
          case 31:
            { yybegin(YYINITIAL); return LengineTypes.CASE;
            }
          // fall through
          case 77: break;
          case 32:
            { yybegin(YYINITIAL); return LengineTypes.LOOP;
            }
          // fall through
          case 78: break;
          case 33:
            { yybegin(YYINITIAL); return LengineTypes.TRUE;
            }
          // fall through
          case 79: break;
          case 34:
            { yybegin(YYINITIAL); return LengineTypes.WHEN;
            }
          // fall through
          case 80: break;
          case 35:
            { yybegin(YYINITIAL); return LengineTypes.FALSE;
            }
          // fall through
          case 81: break;
          case 36:
            { yybegin(YYINITIAL); return LengineTypes.EXPORT;
            }
          // fall through
          case 82: break;
          case 37:
            { yybegin(YYINITIAL); return LengineTypes.IMPORT;
            }
          // fall through
          case 83: break;
          case 38:
            { yybegin(YYINITIAL); return LengineTypes.LAMBDA;
            }
          // fall through
          case 84: break;
          case 39:
            { yybegin(YYINITIAL); return LengineTypes.MODULE;
            }
          // fall through
          case 85: break;
          case 40:
            { yybegin(YYINITIAL); return LengineTypes.NATIVE;
            }
          // fall through
          case 86: break;
          case 41:
            { yybegin(YYINITIAL); return LengineTypes.RETURN;
            }
          // fall through
          case 87: break;
          case 42:
            { yybegin(YYINITIAL); return LengineTypes.DEFAULT;
            }
          // fall through
          case 88: break;
          case 43:
            { yybegin(YYINITIAL); return LengineTypes.RECOVER;
            }
          // fall through
          case 89: break;
          case 44:
            { yybegin(YYINITIAL); return LengineTypes.REQUIRE;
            }
          // fall through
          case 90: break;
          case 45:
            { yybegin(YYINITIAL); return LengineTypes.DEFMACRO;
            }
          // fall through
          case 91: break;
          case 46:
            { yybegin(YYINITIAL); return LengineTypes.OTHERWISE;
            }
          // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
