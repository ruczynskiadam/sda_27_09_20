package sda;


import org.apache.tools.ant.types.Assertions;
import org.junit.Test;

class FirstTest {

        @Test

        void helloTest() {
            
            Assertions.assertFalse(new Greeter().hello().isEmpty());
            
        }
        
        private static class Greeter{
            private String hello(){
                return "Hello";
            }
        }
    }


