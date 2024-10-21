package Oct.ex_14102024_Abstraction.AbstractionQnA;

public class Lab150 {

}
interface I1{
    float PIE = 3.14f;  // it is final can not change , all of them constant in interface.
}  // interface
interface I2{}
class A{} // concrete
class B{}
class Test1 extends A{} // single inheritance
// class Test2 extends A,B{} // multiple inheritance never possible using class
class Test3 implements I1{}
class Test4 implements I1,I2{} // multiple inheritance possible by using interfaces.
class Test5 extends A implements I1,I2{}
//class Test6  implements I1 extends A{} // not possible -> Always first extends then implements.