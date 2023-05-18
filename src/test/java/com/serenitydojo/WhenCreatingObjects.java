package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {


    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido", "Bone", 5);
        {

            //System.out.println(fido.getName());
            Assert.assertEquals(fido.getName(), "Fido");
            Assert.assertEquals(fido.getFavoriteToy(), "Bone");
            Assert.assertEquals(fido.getAge(), 5);


        }
    }
}
