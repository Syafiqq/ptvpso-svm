package com.github.syafiqq.ptvpso.svm.stroke.dataset;

/**
 * This ptvpso-svm created by :
 * Name         : syafiq
 * Date / Time  : 30 August 2016, 2:46 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class StrokeMetadata
{
    private int status;

    public StrokeMetadata(int status)
    {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }
}
