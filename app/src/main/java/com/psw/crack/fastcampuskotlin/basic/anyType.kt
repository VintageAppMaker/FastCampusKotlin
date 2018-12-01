package basic
import com.psw.crack.fastcampuskotlin.TestClass
class AnyTypeTest(p : (String) -> Unit) : TestClass(p){
    override fun doTest() {
        var anything : Any

        anything = 1111
        anything = "문자열테스트"
        anything = 221.01010
        anything = 12.00f

        // is와 !(not) 연산자로 어떤 데이터 형인지 채크가 가능함.
        if(anything !is String) {

            if (anything is Float) {
                println("float입니다")
            }
        }
    }
}
