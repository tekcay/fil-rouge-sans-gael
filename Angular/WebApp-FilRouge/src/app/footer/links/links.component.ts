import { Component } from '@angular/core';
import { Subscription } from 'rxjs';
import { SharedService } from 'src/app/services/shared-service/shared.service';

@Component({
  selector: 'app-links',
  templateUrl: './links.component.html',
  styleUrls: ['./links.component.scss']
})
export class LinksComponent {
  role: string ="";

  private roleSubscription: Subscription = new Subscription;

  constructor(private sharedService: SharedService) {this.role=this.sharedService.getRole()}

  ngOnInit(): void {
    this.roleSubscription=this.sharedService.role.subscribe(r => {console.log("card subscribe")});
  }

  ngOnDestroy(){
    this.roleSubscription.unsubscribe()
  }
}
