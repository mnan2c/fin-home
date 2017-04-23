package com.mnan2c.utils;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * Created by zmn on 2017/4/21.
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/public/*", "/layout");
//                .addExcludedPath("/admin/index")
//                .addExcludedPath("/plugin/*");
    }
}
