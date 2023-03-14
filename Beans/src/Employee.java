import java.io.Serializable;

public class Employee implements Serializable {

        private Integer age;
        private String name;
        public void setAge(Integer age){
            this.age = age;
        }
        public Integer getAge(){
            return  this.age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
}
