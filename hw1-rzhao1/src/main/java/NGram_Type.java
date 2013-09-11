
/* First created by JCasGen Tue Sep 10 22:28:36 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * @generated */
public class NGram_Type extends Source_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("NGram");
 
  /** @generated */
  final Feature casFeat_numOfGram;
  /** @generated */
  final int     casFeatCode_numOfGram;
  /** @generated */ 
  public int getNumOfGram(int addr) {
        if (featOkTst && casFeat_numOfGram == null)
      jcas.throwFeatMissing("numOfGram", "NGram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numOfGram);
  }
  /** @generated */    
  public void setNumOfGram(int addr, int v) {
        if (featOkTst && casFeat_numOfGram == null)
      jcas.throwFeatMissing("numOfGram", "NGram");
    ll_cas.ll_setIntValue(addr, casFeatCode_numOfGram, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startToken;
  /** @generated */
  final int     casFeatCode_startToken;
  /** @generated */ 
  public int getStartToken(int addr) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startToken);
  }
  /** @generated */    
  public void setStartToken(int addr, int v) {
        if (featOkTst && casFeat_startToken == null)
      jcas.throwFeatMissing("startToken", "NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_startToken, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endToken;
  /** @generated */
  final int     casFeatCode_endToken;
  /** @generated */ 
  public int getEndToken(int addr) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endToken);
  }
  /** @generated */    
  public void setEndToken(int addr, int v) {
        if (featOkTst && casFeat_endToken == null)
      jcas.throwFeatMissing("endToken", "NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_endToken, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numOfGram = jcas.getRequiredFeatureDE(casType, "numOfGram", "uima.cas.Integer", featOkTst);
    casFeatCode_numOfGram  = (null == casFeat_numOfGram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numOfGram).getCode();

 
    casFeat_startToken = jcas.getRequiredFeatureDE(casType, "startToken", "Token", featOkTst);
    casFeatCode_startToken  = (null == casFeat_startToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startToken).getCode();

 
    casFeat_endToken = jcas.getRequiredFeatureDE(casType, "endToken", "Token", featOkTst);
    casFeatCode_endToken  = (null == casFeat_endToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endToken).getCode();

  }
}



    