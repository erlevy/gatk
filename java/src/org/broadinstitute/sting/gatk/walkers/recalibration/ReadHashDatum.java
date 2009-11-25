package org.broadinstitute.sting.gatk.walkers.recalibration;

/**
 * Created by IntelliJ IDEA.
 * User: rpoplin
 * Date: Nov 14, 2009
 */
public class ReadHashDatum {
    public String readGroup;
    public String platform;
    public byte[] quals;
    public byte[] bases;
    public boolean isNegStrand;
    public int mappingQuality;
    public int length;
    public Integer tile;

    public ReadHashDatum(String _readGroup, String _platform, byte[] _quals, byte[] _bases, boolean _isNegStrand,
                         int _mappingQuality, int _length, Integer _tile) {
        readGroup = _readGroup;
        platform = _platform;
        quals = _quals;
        bases = _bases;
        isNegStrand = _isNegStrand;
        mappingQuality = _mappingQuality;
        length = _length;
        tile = _tile;
    }

    public ReadHashDatum(ReadHashDatum that) {
        this.readGroup = that.readGroup;
        this.platform = that.platform;
        this.quals = that.quals;
        this.bases = that.bases;
        this.isNegStrand = that.isNegStrand;
        this.mappingQuality = that.mappingQuality;
        this.length = that.length;
        this.tile = that.tile;
    }
}
