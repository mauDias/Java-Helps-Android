package com.javahelps.problem.simplelistview.quote;

import java.util.List;

/**
 * Created by L.Gobinath.
 */
public interface GeneratorListener {
    public void onSucceed(List<Quote> quotes);

    public void onFailed(Exception ex);
}
