package org.broadinstitute.sting.oneoffprojects.walkers;

import org.broadinstitute.sting.gatk.contexts.AlignmentContext;
import org.broadinstitute.sting.gatk.contexts.ReferenceContext;
import org.broadinstitute.sting.gatk.refdata.*;
import org.broadinstitute.sting.gatk.walkers.RodWalker;
import org.broadinstitute.sting.utils.*;

/**
 * Test routine for new VariantContext object
 */
public class TestVariantContextWalker extends RodWalker<Integer, Integer> {

    public Integer map(RefMetaDataTracker tracker, ReferenceContext ref, AlignmentContext context) {
        if ( ref == null )
            return 0;
        else {
            // todo -- this should just invoke the new RefMetaDataConverter, and print out all of the info
//            RODRecordList<ReferenceOrderedDatum> dbsnpList = tracker.getTrackData("dbsnp", null);
//
//            if (dbsnpList != null) {
//                // do dbSNP conversion
//                int n = 0;
//                for (ReferenceOrderedDatum d : dbsnpList) {
//                    rodDbSNP dbsnpRecord = (rodDbSNP)d;
//                    if ( dbsnpRecord.getLocation().getStart() == context.getLocation().getStart() ) {
//                        VariantContext vc = VariantContextAdaptors.convertToVariantContext("dbsnp", dbsnpRecord);
//                        if ( vc != null ) {
//                            n++;
//                            System.out.printf("%s%n", vc);
//                        }
//                    }
//                }
//
//                return n;
//            }
//
//            RODRecordList<ReferenceOrderedDatum> vcfList = tracker.getTrackData("vcf", null);
//            if (vcfList != null) {
//                // do vcf conversion
//                int n = 0;
//                for (ReferenceOrderedDatum d : vcfList) {
//                    RodVCF vcfRecord = (RodVCF)d;
//                    VariantContext vc = VariantContextAdaptors.convertToVariantContext("vcf", vcfRecord);
//                    if ( vc != null ) {
//                        n++;
//                        System.out.printf("%s%n", vc);
//                    }
//                }
//
//                return n;
//            }

            return 0;
        }
    }

    public Integer reduceInit() {
        return 0;
    }

    public Integer reduce(Integer point, Integer sum) {
        return point + sum;
    }
}