import { Component, OnInit } from '@angular/core';
import { BuyNow } from '../models/buy-now';
import { BuyNowService } from '../services/buy-now.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-view-buy-now',
  imports: [FormsModule,CommonModule],
  templateUrl: './view-buy-now.component.html',
  styleUrl: './view-buy-now.component.css'
})
export class ViewBuyNowComponent implements OnInit {
burr:BuyNow[]=[]
  constructor(private bserv:BuyNowService)
  {

  }
  ngOnInit(): void {
    this.bserv.getAllBuyNow().subscribe(data=>
    {
      if(data.length>0)
        this.burr=data
      
    }
    )
  }
}
