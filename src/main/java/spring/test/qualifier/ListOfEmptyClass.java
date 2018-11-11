package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.test.entity.EmptyClass;

import java.util.List;

class ListOfEmptyClass {

    private List<EmptyClass> list;

    public List<EmptyClass> getList() {
        return list;
    }

    @Autowired
    @Qualifier("groupA")
    public void setList(List<EmptyClass> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListOfEmptyClass{" +
                "list=" + list +
                '}';
    }
}
