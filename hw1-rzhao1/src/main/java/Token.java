

/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw1-rzhao1/src/main/resources/hw1-ID-typesystem.xml
 * @generated */
public class Token extends Source {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets It is part-of-speech.
   * @generated */
  public String getPos() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets It is part-of-speech. 
   * @generated */
  public void setPos(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: num

  /** getter for num - gets It indicates the # of the token.
   * @generated */
  public int getNum() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_num == null)
      jcasType.jcas.throwFeatMissing("num", "Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_num);}
    
  /** setter for num - sets It indicates the # of the token. 
   * @generated */
  public void setNum(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_num == null)
      jcasType.jcas.throwFeatMissing("num", "Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_num, v);}    
  }

    