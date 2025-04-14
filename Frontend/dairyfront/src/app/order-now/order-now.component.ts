import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order-now',
  imports: [CommonModule,FormsModule],
  templateUrl: './order-now.component.html',
  styleUrl: './order-now.component.css'
})
export class OrderNowComponent {
constructor(private router:Router)
{

}
  navigatetoBuy(){
    this.router.navigate(["BuyNow"])
  }
 
}
