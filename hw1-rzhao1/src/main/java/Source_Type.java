
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 22:28:45 EDT 2013
 * @generated */
public class Source_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Source_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Source_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Source(addr, Source_Type.this);
  			   Source_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Source(addr, Source_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Source.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Source");
 
  /** @generated */
  final Feature casFeat_souceId;
  /** @generated */
  final int     casFeatCode_souceId;
  /** @generated */ 
  public int getSouceId(int addr) {
        if (featOkTst && casFeat_souceId == null)
      jcas.throwFeatMissing("souceId", "Source");
    return ll_cas.ll_getIntValue(addr, casFeatCode_souceId);
  }
  /** @generated */    
  public void setSouceId(int addr, int v) {
        if (featOkTst && casFeat_souceId == null)
      jcas.throwFeatMissing("souceId", "Source");
    ll_cas.ll_setIntValue(addr, casFeatCode_souceId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "Source");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "Source");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Source_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_souceId = jcas.getRequiredFeatureDE(casType, "souceId", "uima.cas.Integer", featOkTst);
    casFeatCode_souceId  = (null == casFeat_souceId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_souceId).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    