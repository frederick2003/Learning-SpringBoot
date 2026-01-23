package com.frederick2003.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class HeavyResource {

    public HeavyResource(){
        System.out.println("Created heavy resource");
    }
}
