
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
public class Answer_Type extends Source_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_answerId;
  /** @generated */
  final int     casFeatCode_answerId;
  /** @generated */ 
  public int getAnswerId(int addr) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerId);
  }
  /** @generated */    
  public void setAnswerId(int addr, int v) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gs;
  /** @generated */
  final int     casFeatCode_gs;
  /** @generated */ 
  public int getGs(int addr) {
        if (featOkTst && casFeat_gs == null)
      jcas.throwFeatMissing("gs", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_gs);
  }
  /** @generated */    
  public void setGs(int addr, int v) {
        if (featOkTst && casFeat_gs == null)
      jcas.throwFeatMissing("gs", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_gs, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public int getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, int v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerId = jcas.getRequiredFeatureDE(casType, "answerId", "uima.cas.Integer", featOkTst);
    casFeatCode_answerId  = (null == casFeat_answerId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerId).getCode();

 
    casFeat_gs = jcas.getRequiredFeatureDE(casType, "gs", "uima.cas.Integer", featOkTst);
    casFeatCode_gs  = (null == casFeat_gs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gs).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Integer", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

  }
}



    