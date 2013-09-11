

/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * XML source: /Users/ranzhao/Documents/workspace/hw1-rzhao1/src/main/resources/hw1-ID-typesystem.xml
 * @generated */
public class NGram extends Source {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: numOfGram

  /** getter for numOfGram - gets It indicates 1,2,3

   * @generated */
  public int getNumOfGram() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_numOfGram == null)
      jcasType.jcas.throwFeatMissing("numOfGram", "NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_numOfGram);}
    
  /** setter for numOfGram - sets It indicates 1,2,3
 
   * @generated */
  public void setNumOfGram(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_numOfGram == null)
      jcasType.jcas.throwFeatMissing("numOfGram", "NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_numOfGram, v);}    
   
    
  //*--------------*
  //* Feature: startToken

  /** getter for startToken - gets Start token of n gram.
   * @generated */
  public Token getStartToken() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "NGram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_startToken)));}
    
  /** setter for startToken - sets Start token of n gram. 
   * @generated */
  public void setStartToken(Token v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_startToken == null)
      jcasType.jcas.throwFeatMissing("startToken", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_startToken, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endToken

  /** getter for endToken - gets The end token fo the n gram.
   * @generated */
  public Token getEndToken() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "NGram");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_endToken)));}
    
  /** setter for endToken - sets The end token fo the n gram. 
   * @generated */
  public void setEndToken(Token v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_endToken == null)
      jcasType.jcas.throwFeatMissing("endToken", "NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_endToken, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    