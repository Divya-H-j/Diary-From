import { Component, OnInit } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../services/feedback.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-viewfeedback',
  imports: [CommonModule,FormsModule],
  templateUrl: './viewfeedback.component.html',
  styleUrl: './viewfeedback.component.css'
})
export class ViewfeedbackComponent  implements OnInit{
  farr:Feedback[]=[]

  constructor(private fserv:FeedbackService)
  {

  }
  
  ngOnInit(): void {
    
    this.fserv.getallfeedback().subscribe(data=>{
      if(data.length>0)
        this.farr=data
    }
    )
  }


}
