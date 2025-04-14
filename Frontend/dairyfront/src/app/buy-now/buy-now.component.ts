import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { BuyNow } from '../models/buy-now';
import { BuyNowService } from '../services/buy-now.service';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-buy-now',
  imports: [FormsModule,CommonModule],
  templateUrl: './buy-now.component.html',
  styleUrl: './buy-now.component.css'
})
export class BuyNowComponent {

  buy: BuyNow = new BuyNow()
  constructor(private buyserv: BuyNowService) {

  }

  submitdata() {
    this.buyserv.save(this.buy).subscribe(data => {
      if (data != null) {
        alert("Order is successfully!")
      }
    })
  }

}
