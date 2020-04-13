package com.yhx.yhx_crm.entity;



public class EmpRole extends BaseEntity {

    private Integer  empId;

    private Integer roleId;

    @Override
    public String toString() {
        return "EmpRole{" +
                "empId=" + empId +
                ", roleId=" + roleId +
                '}';
    }

    public EmpRole(Integer empId, Integer roleId) {
        this.empId = empId;
        this.roleId = roleId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
