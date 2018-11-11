package spring.test.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

class ListOfA {

    private List<A> list;

    public List<A> getList() {
        return list;
    }

    @Autowired
    @Qualifier("groupA")
    public void setList(List<A> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListOfA{" +
                "list=" + list +
                '}';
    }
}
