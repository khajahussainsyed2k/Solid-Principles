package com.company;

class MjcetOfflineLibrary implements Library {
    public void issues() {
        System.out.println("issues section");
    }

    public void returns() {
        System.out.println("returns section");
    }

    @Override
    public void eBooks() {
//not applicable for this library
    }

    @Override
    public void signInDetails() {
        //not applicable for this library

    }

}
