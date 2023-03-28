package com.opencast.m5;

import com.opencast.ScriptBase;
import org.junit.jupiter.api.Test;

public class GettingContent extends ScriptBase {

    @Test
    public void gettingElements() {

        page.navigate(home);
        
        System.out.println("======= Text content =======");
        System.out.println(page.textContent("#hero-banner"));

        System.out.println("======= Inner Text =======");
        System.out.println(page.innerText("#hero-banner"));

        System.out.println("======= Inner HTML =======");
        System.out.println(page.innerHTML("#hero-banner"));

        System.out.println("======= Get Attribute =======");
        System.out.println(page.getAttribute("img", "alt")); // bag

    }
}
