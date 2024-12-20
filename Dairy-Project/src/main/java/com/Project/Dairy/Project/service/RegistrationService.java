package com.Project.Dairy.Project.service;

import java.util.List;

import com.Project.Dairy.Project.model.Registration;

public interface RegistrationService {
Registration insertrecord(Registration r);
List<Registration> getAll();
void del(int ri);
Registration updaterecord(int i,Registration r);

List<Registration> login(String emailid,String passwod);
}
