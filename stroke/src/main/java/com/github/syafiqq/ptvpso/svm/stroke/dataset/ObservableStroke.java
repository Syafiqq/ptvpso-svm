package com.github.syafiqq.ptvpso.svm.stroke.dataset;

import java.util.Observable;

/**
 * This <AppStroke> project in package <id.ac.ub.filkom.sekcv.appstroke.model.adapter> created by :
 * Name         : syafiq
 * Date / Time  : 09 September 2016, 12:37 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class ObservableStroke extends Observable
{
    private Stroke stroke;

    public ObservableStroke()
    {
        super();
        this.stroke = null;
    }

    public ObservableStroke(Stroke stroke)
    {
        super();
        this.stroke = stroke;
    }

    private void update()
    {
        super.setChanged();
        super.notifyObservers();
    }

    public void updateStroke(StrokeParameter parameter, StrokeMetadata metadata)
    {
        if(this.stroke == null)
        {
            this.stroke = new Stroke(null, null);
        }
        this.stroke.setParameter(parameter);
        this.stroke.setMetadata(metadata);
        this.update();
    }

    public void updateStroke(Stroke stroke)
    {
        if(this.stroke == null)
        {
            this.stroke = new Stroke(null, null);
        }

        this.stroke.updateStroke(stroke);
        this.update();
    }

    public void updateParameter(StrokeParameter parameter)
    {
        if(this.stroke == null)
        {
            this.stroke = new Stroke(null, null);
        }
        this.stroke.setParameter(parameter);
        this.update();
    }

    public void updateMetadata(StrokeMetadata metadata)
    {
        if(this.stroke == null)
        {
            this.stroke = new Stroke(null, null);
        }
        this.stroke.setMetadata(metadata);
        this.update();
    }

    public Stroke getStroke()
    {
        return this.stroke;
    }
}
