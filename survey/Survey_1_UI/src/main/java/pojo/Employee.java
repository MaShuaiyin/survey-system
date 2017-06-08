package pojo;

/**
 * Created by MaShuaiyin on 2017/6/3.
 */
public class Employee {
    private int empId;
    private String empName;
    private Integer empAge;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (empName != null ? !empName.equals(employee.empName) : employee.empName != null) return false;
        if (empAge != null ? !empAge.equals(employee.empAge) : employee.empAge != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empAge != null ? empAge.hashCode() : 0);
        return result;
    }
}
