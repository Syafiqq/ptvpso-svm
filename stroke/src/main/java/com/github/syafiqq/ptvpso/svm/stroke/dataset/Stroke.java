package com.github.syafiqq.ptvpso.svm.stroke.dataset;

/**
 * This <ptvpso-svm> created by :
 * Name         : syafiq
 * Date / Time  : 02 September 2016, 10:42 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class Stroke
{
    private StrokeParameter parameter;
    private StrokeMetadata metadata;

    public Stroke()
    {
        this(null, null);
    }

    public Stroke(StrokeParameter parameter, StrokeMetadata metadata)
    {
        this.parameter = parameter;
        this.metadata = metadata;
    }

    public StrokeParameter getParameter()
    {
        return this.parameter;
    }

    public void setParameter(StrokeParameter parameter)
    {
        this.parameter = parameter;
    }

    public StrokeMetadata getMetadata()
    {
        return this.metadata;
    }

    public void setMetadata(StrokeMetadata metadata)
    {
        this.metadata = metadata;
    }

    public void updateStroke(final Stroke stroke)
    {
        this.updateStroke(stroke.parameter, stroke.metadata);
    }

    public void updateStroke(final StrokeParameter parameter, final StrokeMetadata metadata)
    {
        this.setParameter(parameter);
        this.setMetadata(metadata);
    }
}
