package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Facture {
    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;private String amount;  private String description; 
    @JoinColumn(name = "client_id")
    private Client client;
    public Facture(){}
    public Facture(long id,String description,Client client){
        this.id=id;;
        this.description=description;
  this.client=client;
    }

    public String getAmount(){
        return amount;
    }
}
