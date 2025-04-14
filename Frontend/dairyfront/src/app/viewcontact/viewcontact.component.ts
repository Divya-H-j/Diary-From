import { Component, OnInit } from '@angular/core';
import { Contacts } from '../models/contacts';
import { ContactsService } from '../services/contacts.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-viewcontact',
  imports: [CommonModule],
  templateUrl: './viewcontact.component.html',
  styleUrl: './viewcontact.component.css'
})
export class ViewcontactComponent implements OnInit {

  corr:Contacts[]=[]

  constructor(private cserv:ContactsService){

  }

  ngOnInit(): void {
  this.cserv.getAllcontacts().subscribe(data=>{
    if(data.length>0)
      this.corr=data
  })
  }

  
}
