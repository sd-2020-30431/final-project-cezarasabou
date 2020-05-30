import { Component, OnInit } from '@angular/core';
import {MedicalHistory} from "./medicalHistory";

@Component({
  selector: 'app-medical-history',
  templateUrl: './medical-history.component.html',
  styleUrls: ['./medical-history.component.css']
})
export class MedicalHistoryComponent implements OnInit {

  medicalHistory: MedicalHistory;
  constructor() {
  }

  ngOnInit(): void {
    this.medicalHistory = new MedicalHistory();
  }

}
