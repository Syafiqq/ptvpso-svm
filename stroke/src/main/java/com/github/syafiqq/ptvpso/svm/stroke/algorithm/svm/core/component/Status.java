package com.github.syafiqq.ptvpso.svm.stroke.algorithm.svm.core.component;

/**
 * This ptvpso-svm created by :
 * Name         : syafiq
 * Date / Time  : 30 August 2016, 11:55 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public enum Status
{
    NORMAL(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Status("normal", "Normal")),
    HIGH(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Status("rentan", "Rentan")),
    DANGER(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Status("mengkhawatirkan", "Mengkhawatirkan"));

    private final com.github.syafiqq.ptvpso.svm.stroke.dataset.Status status;

    Status(com.github.syafiqq.ptvpso.svm.stroke.dataset.Status status)
    {
        this.status = status;
    }

    public com.github.syafiqq.ptvpso.svm.stroke.dataset.Status getStatus()
    {
        return status;
    }
}
