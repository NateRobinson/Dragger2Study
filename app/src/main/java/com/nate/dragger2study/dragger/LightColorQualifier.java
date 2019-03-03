package com.nate.dragger2study.dragger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/**
 * Created by Nate Gu on 2019/3/3
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface LightColorQualifier {
  String value() default "white";
}
