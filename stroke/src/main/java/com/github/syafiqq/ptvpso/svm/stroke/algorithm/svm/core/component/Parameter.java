package com.github.syafiqq.ptvpso.svm.stroke.algorithm.svm.core.component;


/**
 * This ptvpso-svm created by :
 * Name         : syafiq
 * Date / Time  : 30 August 2016, 11:08 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public enum Parameter
{
    AGE(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter("age", "Age", parseColor("#8BC34A"))),
    CHOLESTEROL(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter("cholesterol", "Cholesterol", parseColor("#E91E63"))),
    HDL(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter("hdl", "HDL", parseColor("#3F51B5"))),
    LDL(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter("ldl", "LDL", parseColor("#00BCD4"))),
    TRIGLYCERIDE(new com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter("triglyceride", "Triglyceride", parseColor("#FFC107")));

    private final com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter parameter;

    Parameter(com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter parameter)
    {
        this.parameter = parameter;
    }

    public com.github.syafiqq.ptvpso.svm.stroke.dataset.Parameter getParameter()
    {
        return parameter;
    }

    public static int parseColor(String colorString)
    {
        long color = Long.parseLong(colorString.substring(1), 16);
        if(colorString.length() == 7)
        {
            // Set the alpha value
            color |= 0x00000000ff000000;
        }
        else if(colorString.length() != 9)
        {
            throw new IllegalArgumentException("Unknown color");
        }
        return (int) color;
    }

}
