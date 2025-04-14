import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Prodect } from '../models/prodect';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-prodect',
  imports: [FormsModule, CommonModule],
  templateUrl: './prodect.component.html',
  styleUrl: './prodect.component.css'
})
export class ProdectComponent implements OnInit {
  Prodect: Prodect[] = []
  login = false
  ProdectService: any;
  Prodects: Prodect[] = [];
  prodectService: any;
  constructor(private router: Router) {

  }
  getAllProdects() {

    this.prodectService.getAll().subscribe((response: Prodect[]) => {
      console.log(response)
      this.Prodect = response
    },

      (error: HttpErrorResponse) => {
        console.log(error)
      });
  }
  navigatetoOrder(){
    this.router.navigate(["OrderNow"])
  }
  ngOnInit(): void {
    this.getAllProdects()
    console.log(localStorage.getItem("emailid"))
    if (localStorage.getItem("emailid") != null)
      this.login = true
  }


  enroll(id: any) {
    this.router.navigate(["/enroll", id])
  }

 
}