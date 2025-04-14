import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Contacts } from '../models/contacts';
import { CommonModule } from '@angular/common';
import { ContactsService } from '../services/contacts.service';

@Component({
  selector: 'app-contacts',
  imports: [FormsModule,CommonModule],
  templateUrl: './contacts.component.html',
  styleUrl: './contacts.component.css'
})
export class ContactsComponent {
 con:Contacts=new Contacts()

constructor(private conserv:ContactsService)
{

}

 submitdata()
 {
this.conserv.save(this.con).subscribe(data=>{
  if(data!=null)
  {
    alert("contact is successfully!")
  }
})
 }


}
