package com.github.syafiqq.ptvpso.svm.stroke.algorithm.svm.method.oaa;

/**
 * This <ptvpso-svm> created by :
 * Name         : syafiq
 * Date / Time  : 29 August 2016, 10:27 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class Parameter
{
    final private int    clazz;
    final private double multiplier;

    public Parameter(int clazz, double multiplier)
    {
        this.clazz = clazz;
        this.multiplier = multiplier;
    }

    public int getClazz()
    {
        return this.clazz;
    }

    public double getMultiplier()
    {
        return this.multiplier;
    }
}
