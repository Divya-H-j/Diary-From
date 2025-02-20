package com.Project.Dairy.Project.service;

import java.util.List;

import com.Project.Dairy.Project.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin> login(String email,String password);
}
