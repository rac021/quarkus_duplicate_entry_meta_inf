
package com.rac021.quarkus.certme.extention ;

/**
 *
 * @author ryahiaoui
 */

import javax.inject.Singleton ;
import io.quarkus.runtime.annotations.ConfigPhase ;
import io.quarkus.runtime.annotations.ConfigRoot;

/**
 *
 * @author ryahiaoui
 */

@Singleton
@ConfigRoot(name = "certme", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class CertMe {
    
    public CertMe() throws Exception    {
	
        System.out.println( " \n Say Hello From Quarkus Extension \n " ) ;
    }
}


            