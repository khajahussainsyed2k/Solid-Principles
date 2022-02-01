package com.company;

class Department {
    private String departmenttName;

    public void printHODName(String departmentName) {
        if (departmenttName.equals("CSE"))
            System.out.println("CSE's__HOd__name");
        else if (departmenttName.equals("IT"))
            System.out.println("IT's__HOD__name");
    }
}
