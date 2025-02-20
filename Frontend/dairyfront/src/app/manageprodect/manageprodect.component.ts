
import { Component } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { Router } from '@angular/router';
import { FileHandle } from '../models/file-handle';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Prodect } from '../models/prodect';
import { ProdectService } from '../services/prodect.service';
import { NgOptimizedImage } from '@angular/common';

@Component({
  selector: 'app-managecourse',
  imports: [FormsModule, CommonModule],
  templateUrl: './manageprodect.component.html',
  styleUrl: './manageprodect.component.css'
})
export class ManageprodectComponent {
  prodect: Prodect = new Prodect();
  submitted = false;
  errordata = "";
  constructor(private prodectService: ProdectService, private router: Router, private sanitizer: DomSanitizer) { }

  ngOnInit() {

  }
  newProdect(): void {
    this.submitted = false;
    this.prodect = new Prodect();
  }

  save() {

    const formData = this.prepareFormData(this.prodect);
    this.prodectService.createProdect(formData).subscribe(data => {
      if (data != null) {
        alert("Prodect added successfully")
        console.log(data)
        this.gotoList();
      }
    },
      error => {
        console.log(error);
        this.errordata = error;

      })
  }
  prepareFormData(prodect: Prodect): FormData {
    const formData = new FormData()
    formData.append(
      'prodect',
      new Blob([JSON.stringify(prodect)], { type: "application/json" })
    );
    for (var i = 0; i < prodect.prodectImages.length; i++) {
      formData.append(
        'imageFile',
        prodect.prodectImages[i].file,
        prodect.prodectImages[i].file.name
      );
    }
    return formData;
  }
  removeImage(i: number) {
    this.prodect.prodectImages.splice(i, 1)
  }
  onFileSelected(event: any) {
    if (event.target.files) {
      const file = event.target.files[0];
      const fileHandle: FileHandle = {
        file: file,
        url: this.sanitizer.bypassSecurityTrustUrl(window.URL.createObjectURL(file)),
        name: file.name


      }
      this.prodect.prodectImages.push(fileHandle)
    }
  }
  onSubmit() {
    this.save();
    this.submitted = true;
    console.log("inside on submit")
  }

  gotoList() {
    this.router.navigate(['/']);
  }

}

