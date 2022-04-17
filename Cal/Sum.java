package mypack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sum", propOrder = {
        "arg0",
        "arg1"
})
public class Sum {

    protected int arg0;
    protected int arg1;

    /**
     * Gets the value of the arg0 property.
     *
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     *
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     *
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

}