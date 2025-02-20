import { Component } from '@angular/core';
import { Adminlogin } from '../models/adminlogin';
import { FormsModule } from '@angular/forms';
import { AdminloginService } from '../services/adminlogin.service';
import { Route, Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-admin-login',
  imports: [FormsModule,CommonModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
adm:Adminlogin=new Adminlogin()


constructor(private admserv:AdminloginService,private router:Router)
{

}

submitdata(){
this.admserv.login(this.adm.email,this.adm.password).subscribe(data=>{
  if(data.length>0)
  {
    localStorage.setItem("usertype","admin")
    this.router.navigate(["/"])
  }
})
}

}
