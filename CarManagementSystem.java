package OOPS.CarMangementSystem;
import java.util.Scanner;
import java.util.Random;
//-------------------------------------------------------------Interface-----------------------------------------------------------------
interface Body
{
    void getDetails();
    void setDetails(Scanner sc);
}

//---------------------------------------------------showroom_class-----------------------------------------------------------------------

class ShowRoom implements Body
{
    
    int ShowroomId;
    ShowRoom()
    {
       Random r=new Random();
       ShowroomId=100000000+r.nextInt(900000000);
    }
    
    String ShowroomName;
    String ShowroomManagerName;
    String ShowroomAdress;
    int TotalEmploye;
    int TotalCar;

    @Override
    public void setDetails(Scanner sc)
    {
      System.out.println();
      System.out.println("=============================>>>ENTER_SHOWROOM_DETAILS<<<============================")  ;
      System.out.println();
      System.out.print("ENTER_SHOWROOM_NAME:");
      ShowroomName=sc.nextLine();
      System.out.print("ENTER_MANAGER_NAME:");
      ShowroomManagerName=sc.nextLine();
      System.out.print("ENTER_SHOWROOM_ADDRESS:");
      ShowroomAdress=sc.nextLine();
      System.out.print("ENTER_TOTAL_EMPLOYE:");
      TotalEmploye=Integer.parseInt(sc.nextLine());
      System.out.print("ENTER_TOTAL_CAR:");
      TotalCar=Integer.parseInt(sc.nextLine());
      System.out.println("                                 [SHOWROOM_HAS_SUCCESSFULLY_ADDED]");
      System.out.println();
      System.out.println("       <<[1.ADD_SHOWROOM]>>                <<[10.MEIN_MENU]>>                <<[0.EXIT]>>");
    }

    @Override
    public void getDetails()
    {
      System.out.println("---------------------------------------------******************--------------------------------------------");  
      System.out.println("SHOWROOM_NAME:"+ShowroomName);
      System.out.println("SHOWROOM_ID:"+ShowroomId);
      System.out.println("MANAGER_MANAGER_NAME:"+ShowroomManagerName);
      System.out.println("SHOWROOM_ADDRESS:"+ShowroomAdress);
      System.out.println("TOTAL_EMPLOYE:"+TotalEmploye);
      System.out.println("TOTAL_CAR:"+TotalCar);
      System.out.println("---------------------------------------------*******************--------------------------------------------");
    }

}

//---------------------------------------------------------------------employe_class-----------------------------------------------------

class Employe implements Body
{
    
    int EmployeId;
    Employe()
    {
        Random r=new Random();
       EmployeId=100000+r.nextInt(900000);
    }

    String EmployeName;
    String EmployeType;
    String EmployeShowroom;
    String EmployePhone;
    @Override
    public void setDetails(Scanner sc)
    {
      System.out.println();
      System.out.println("=============================>>>ENTER_EMPLOYE_DETAILS<<<============================")  ;
      System.out.println();
      System.out.print("ENTER_EMPLOYE_NAME:");
      EmployeName=sc.nextLine();
      System.out.print("ENTER_EMPLOYE_TYPE:");
      EmployeType=sc.nextLine();
      System.out.print("ENTER_ASSIGNED_SHOWROOM:");
      EmployeShowroom=sc.nextLine();
      System.out.print("ENTER_PHONE_NUMBER:");
      EmployePhone=sc.nextLine();
      System.out.println("                                 [EMPLOYE_HAS_SUCCESSFULLY_ADDED]");
      System.out.println();
      System.out.println("       <<[4.ADD_EMPLOYE]>>                <<[10.MAIN_MENU]>>                <<[0.EXIT]>>");
      System.out.println();

    }
    
    @Override
    public void getDetails()
    {
      System.out.println("---------------------------------------------******************--------------------------------------------");  
      System.out.println("EMPLOYE_NAME:"+EmployeName);
      System.out.println("EMPLOYE_ID:"+EmployeId);
      System.out.println("EMPLOYE_TYPE:"+EmployeType);
      System.out.println("WORKING_SHOWROOM:"+EmployeShowroom);
      System.out.println("PHONE_NUMBER:"+EmployePhone);
      System.out.println("---------------------------------------------******************--------------------------------------------");
    }

}

//---------------------------------------------------------------------car_class-----------------------------------------------------------

class Car implements Body
{
    String CarName;
    String CarId;
    String CarBrand;
    String CarModel;
    String CarColour;
    double CarPrice;
    String CarFuelType;
    String CarShowroom;
    

    @Override
    public void setDetails(Scanner sc)
    {
        System.out.println();
      System.out.println("=============================>>>ENTER_CAR_DETAILS<<<============================")  ;
      System.out.println();
       System.out.print("ENTER_CAR_NAME:");
       CarName=sc.nextLine();
       System.out.print("ENTER_CAR_ID:");
       CarId=sc.nextLine();
       System.out.print("ENTER_BRAND:");
       CarBrand=sc.nextLine();
       System.out.print("ENTER_CAR_MODEL:");
       CarModel=sc.nextLine();
       System.out.print("ENTER_CAR_COLOUR:");
       CarColour=sc.nextLine();
       System.out.print("ENTER_CAR_PRICE:");
       CarPrice=Double.parseDouble(sc.nextLine());
       System.out.print("ENTER_FUEL_TYPE:");
       CarFuelType=sc.nextLine();
       System.out.print("ENTER_SHOWROOM_NAME:");
       CarShowroom=sc.nextLine();  
       System.out.println("                                 [CAR_HAS_SUCCESSFULLY_ADDED]");
      System.out.println();
      System.out.println("       <<[7.ADD_CAR]>>                <<[10.MEIN_MENU]>>                <<[0.EXIT]>>");
      System.out.println();                                 
    }
    
    @Override
    public void getDetails()
    {
      System.out.println("---------------------------------------------******************--------------------------------------------");
       System.out.println("CAR_NAME:"+CarName);
       System.out.println("CAR_ID:"+CarId);
       System.out.println("BRAND:"+CarBrand);
       System.out.println("CAR_MODEL:"+CarModel);
       System.out.println("CAR_COLOUR:"+CarColour);
       System.out.println("CAR_PRICE:"+CarPrice);
       System.out.println("FUEL_TYPE:"+CarFuelType);
       System.out.println("SHOWROOM_NAME:"+CarShowroom);
       System.out.println("---------------------------------------------******************--------------------------------------------");
    }

}

//----------------------------------------------------main_class----------------------------------------------------------------

public class CarManagementSystem
{

    public static void Menu()
    {
        System.out.println();
        System.out.println("==========================================MAIN_MENU==================================================");
        System.out.println();
        System.out.println("    <<[1.ADD_SHOWROOM]>>                 <<[2.SEE_SHOWROOM]>>             <<[3.UPDATE_SHOWROOM]>>");
        System.out.println();
        System.out.println("    <<[4.ADD_EMPLOYE]>>                  <<[5.SEE_EMPLOYE]>>               <<[6.UPDATE_EMPLOYE]>>");
        System.out.println();
        System.out.println("     <<[7.ADD_CAR]>>                       <<[8.SEE_CAR]>>                  <<[9.UPDATE_CAR]>>");
        System.out.println();
        System.out.println("                                            <<[0.EXIT]>>");
        System.out.println();
        System.out.print(">>>>>>>ENTER_YOUR_CHOICE:");
    }

    //---------------------------------------------------------------main_method----------------------------------------------------------------------

 public static void main(String [] args)
 {
    ShowRoom[] showroom=new ShowRoom[20];
    Employe[] employe=new Employe[100];
    Car[] car=new Car[500];
    int sco=0;
    int eco=0;
    int cco=0;
    int ch=100;
    int i=0;
    Scanner sc=new Scanner(System.in);
    Menu();

      while(true)
      {

      ch=Integer.parseInt(sc.nextLine());
      switch(ch)
      {
        case 0:
            {
                return;
            }

        case 1://---------------------------------------------Add_showroom----------------------------------------------------------------------------
            {
                if (sco == showroom.length)
                     {
                        System.out.println();
                       System.out.println("---------------------------------------SHOWROOM_LIMIT_REACHED---------------------------------------------");
                       System.out.println();
                       break;
                     }
              showroom[sco]=new ShowRoom();
              showroom[sco].setDetails(sc);  
              sco++;
              break;

            }

        case 2://------------------------------------------------------------------show_showroom--------------------------------------------------------
            {
                System.out.println();
                System.out.println("=====================================****HERE_THE_ALL_SHOWROOM_DETAILS****=====================================");
                 System.out.println();
             for(i=0;i<sco;i++)
                {
                    System.out.println();
                    showroom[i].getDetails();
                    System.out.println();
                } 

                 System.out.println();
                System.out.println("        <<[3.UPDATE_SHOWROOM]>>                <<[10.MAIN_MENU]>>                <<[0.EXIT]>>");
                break;
            }
            
        case 3://------------------------------------------------------------Edit_showroom---------------------------------------------
            {
                int sid;
                int temp;
               System.out.println();
               System.out.print(">>>>>>>>>>>>>>>ENTER_SHOWROOM_ID:");
               sid=Integer.parseInt(sc.nextLine());
               for(i=0;i<sco;i++)
               {
                if(showroom[i].ShowroomId==sid)
                {
                    break;
                }
               }
               
               if(i==sco)
               {
                System.out.println();
                System.out.println("------------------------------------------------[WRONG ID]-----------------------------------------------------");
                System.out.println();
                Menu();    
                break;
               }

               while(true)
               {
               System.out.println();
               System.out.println("===============================>>>>EDIT_MENU_FOR_SHOWROOM:"+showroom[i].ShowroomId+"<<<<===================================");
               System.out.println();
               System.out.println("     <<[1.EDIT_SHOWROOM_NAME]>>               <<[2.EDIT_MANAGER_NAME]>>               <<[3.EDIT_ADDRESS]>>");
               System.out.println();
               System.out.println("     <<[4.EDIT_TOTAL_EMPLOYE]>>                <<[5.EDIT_TOTAL_CAR]>>                 <<[6.MAIN_MENU]>>");
               System.out.println();
               
               temp=Integer.parseInt(sc.nextLine());
               switch(temp)
               {
                
                case 1:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_SHOWROOM_NAME:"+showroom[i].ShowroomName);
                        System.out.print("ENTER_MODIFIED_SHOWROOM_NAME:");
                        showroom[i].ShowroomName=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------SHOWROOM_NAME_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }    
                case 2:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_MANAGER_NAME:"+showroom[i].ShowroomManagerName);
                        System.out.print("ENTER_MODIFIED_MANAGER_NAME:");
                        showroom[i].ShowroomManagerName=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------MANAGER_NAME_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 3:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_SHOWROOM_ADDRESS:"+showroom[i].ShowroomAdress);
                        System.out.print("ENTER_MODIFIED_SHOWROOM_ADDRESS:");
                        showroom[i].ShowroomAdress=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------SHOWROOM_ADDRESS_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 4:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_TOTAL_EMPLOYE:"+showroom[i].TotalEmploye);
                        System.out.print("ENTER_MODIFIED_TOTAL_EMPLOYE:");
                        showroom[i].TotalEmploye=Integer.parseInt(sc.nextLine());
                        System.out.println();
                        System.out.println("                     ------------TOTAL_EMPLOYE_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 5:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_TOTAL_CAR:"+showroom[i].TotalCar);
                        System.out.print("ENTER_MODIFIED_TOTAL_CAR:");
                        showroom[i].TotalCar=Integer.parseInt(sc.nextLine());
                        System.out.println();
                        System.out.println("                     ------------TOTAL_CAR_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 6:       
                    {
                        Menu();
                        break;
                    }         
                    
                default:
                   {
                        System.out.println();
                        System.out.println("                     -------------------------[WRONG_INPUT]-------------------------                              ");
                        System.err.println();

                    }    
               }
               if(temp==6)  break;

            }
            break;   
            }

        case 4://-------------------------------------------------------------------add_employe-----------------------------------------------------
            {
                
                if (eco == employe.length)
                     {
                        System.out.println();
                       System.out.println("-------------------------------------------EMPLOYE_LIMIT_REACHED----------------------------------------");
                      System.out.println();
                       break;
                     }
               employe[eco]=new Employe();
               employe[eco].setDetails(sc);
               eco++;
               break;
            }

        case 5://----------------------------------------------------------------------show_employee-------------------------------------------------------
            {
               
                System.out.println();
                System.out.println("=====================================****HERE_THE_ALL_EMPLOYE_DETAILS****=====================================");
                 System.out.println();
             for(i=0;i<eco;i++)
                {
                    System.out.println();
                    employe[i].getDetails();
                    System.out.println();
                } 
                 System.out.println();
                System.out.println("        <<[6.UPDATE_EMPLOYE]>>                <<[10.MAIN_MENU]>>                <<[0.EXIT]>>");
                break;
            }

        case 6://---------------------------------------------------Edit_employee--------------------------------------------------------------
            {
               
                int eid;
                int temp;
               System.out.println();
               System.out.print(">>>>>>>>>>>>>>>ENTER_EMPLOYE_ID:");
               eid=Integer.parseInt(sc.nextLine());
               for(i=0;i<eco;i++)
               {
                if(employe[i].EmployeId==eid)
                {
                    break;
                }
               }
               
               if(i==eco)
               {
                System.out.println();
                System.out.println("------------------------------------------------[WRONG ID]-----------------------------------------------------");
                System.out.println();
                Menu();    
                break;
               }

               while(true)
               {
               System.out.println();
               System.out.println("===============================>>>>EDIT_MENU_FOR_EMPLOYE:"+employe[i].EmployeId+"<<<<===================================");
               System.out.println();
               System.out.println("     <<[1.EDIT_EMPLOYE_NAME]>>         <<[2.EDIT_EMPLOYE_TYPE]>>            <<[3.EDIT_EMPLOYE_SHOWROOM]>>");
               System.out.println();
               System.out.println("                <<[4.EDIT_EMPLOYE_PHONE]>>                       <<[5.MAIN_MENU]>>");
               System.out.println();
               
               temp=Integer.parseInt(sc.nextLine());
               switch(temp)
               {
                
                case 1:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_EMPLOYE_NAME:"+employe[i].EmployeName);
                        System.out.print("ENTER_MODIFIED_EMPLOYE_NAME:");
                        employe[i].EmployeName=sc.nextLine();
                        System.out.println();
                        System.out.println("                     -----------EMPLOYE_NAME_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }    
                case 2:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_EMPLOYE_TYPE:"+employe[i].EmployeType);
                        System.out.print("ENTER_MODIFIED_EMPLOYE_TYPE:");
                        employe[i].EmployeType=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------EMPLOYE_TYPE_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 3:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_EMPLOYE_SHOWROOM:"+employe[i].EmployeShowroom);
                        System.out.print("ENTER_MODIFIED_EMPLOYE_SHOWROOM:");
                        employe[i].EmployeShowroom=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------EMPLOYE_SHOWROOM_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 4:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_EMPLOYE_PHONE:"+employe[i].EmployePhone);
                        System.out.print("ENTER_MODIFIED_EMPLOYE_PHONE:");
                        employe[i].EmployePhone=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------EMPLOYE_PHONE_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
        
                case 5:       
                    {
                        Menu();
                        break;
                    }         
                    
                default:
                   {
                        System.out.println();
                        System.out.println("                     -------------------------[WRONG_INPUT]-------------------------                              ");
                        System.err.println();

                    }    
               }
               if(temp==5)  break;

            }
            break; 
            }

        case 7://------------------------------------------------------Add_car---------------------------------------------------------------
            {
                 if (cco == car.length)
                     {
                        System.out.println();
                       System.out.println("---------------------------------------CAR_LIMIT_REACHED---------------------------------------------");
                       System.out.println();
                       break;
                     }
                
                car[cco]=new Car();
                car[cco].setDetails(sc);
                cco++;
                break;
            }

        case 8://------------------------------------------------------------Show_car---------------------------------------------------------------------
            {
                 System.out.println();
                System.out.println("=====================================****HERE_THE_ALL_CAR_DETAILS****=====================================");
                 System.out.println();
             for(i=0;i<cco;i++)
                {
                    System.out.println();
                    car[i].getDetails();
                    System.out.println();
                } 
                 System.out.println();
                System.out.println("        <<[9.UPDATE_CAR]>>                <<[10.MAIN_MENU]>>                <<[0.EXIT]>>");
                break;
            }

        case 9: //--------------------------------------------------Edit_car-------------------------------------------------------------------
            {
                 
                String cid;
                int temp;
               System.out.println();
               System.out.print(">>>>>>>>>>>>>>>ENTER_CAR_ID:");
               cid=sc.nextLine();
               for(i=0;i<cco;i++)
               {
                if(cid.equals(car[i].CarId))
                {
                    break;
                }
               }
               
               if(i==cco)
               {
                System.out.println();
                System.out.println("------------------------------------------------[WRONG ID]-----------------------------------------------------");
                System.out.println();
                Menu();    
                break;
               }

               while(true)
               {
               System.out.println();
               System.out.println("===============================>>>>EDIT_MENU_FOR_CAR:"+car[i].CarId+"<<<<===================================");
               System.out.println();
               System.out.println("     <<[1.EDIT_CAR_NAME]>>               <<[2.EDIT_CAR_BRAND]>>               <<[3.EDIT_CAR_MODEL]>>");
               System.out.println();
               System.out.println("    <<[4.EDIT_CAR_COLOUR]>>            <<[5.EDIT_CAR_FUEL_TYPE]>>             <<[6.EDIT_CAR_SHOWROOM]>>");
               System.out.println();
               System.out.println("                      <<[7.EDIT_CAR_PRICE]>>                   <<[8.MAIN_MENU]>>                " );
               System.out.println();
               
               
               temp=Integer.parseInt(sc.nextLine());
               switch(temp)
               {
                
                case 1:
                    {
                        System.out.println();
                        System.out.println("PREVIOUS_CAR_NAME:"+car[i].CarName);
                        System.out.print("ENTER_MODIFIED_CAR_NAME:");
                        car[i].CarName=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_NAME_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }    
                case 2:
                    {
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_BRAND:"+car[i].CarBrand);
                        System.out.print("ENTER_MODIFIED_CAR_BRAND:");
                        car[i].CarBrand=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_BRAND_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 3:
                    {
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_MODEL:"+car[i].CarModel);
                        System.out.print("ENTER_MODIFIED_CAR_MODEL:");
                        car[i].CarModel=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_MODEL_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 4:
                    {
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_COLOUR:"+car[i].CarColour);
                        System.out.print("ENTER_MODIFIED_CAR_COLOUR:");
                        car[i].CarColour=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_COLOUR_HAS_SUCCESSFULLY_EDITED----------                              ");
                        System.err.println();
                        break;
                    }
                case 5:
                    {
                       
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_FUEL_TYPE:"+car[i].CarFuelType);
                        System.out.print("ENTER_MODIFIED_CAR_FUEL_TYPE:");
                        car[i].CarFuelType=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_FUEL_TYPE_HAS_SUCCESSFULLY_EDITED----------              ");
                        System.out.println();
                        break;                          
                    }
                case 6:
                    {
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_SHOWROOM:"+car[i].CarShowroom);
                        System.out.print("ENTER_MODIFIED_CAR_SHOWROOM:");
                        car[i].CarShowroom=sc.nextLine();
                        System.out.println();
                        System.out.println("                     ------------CAR_SHOWROOM_HAS_SUCCESSFULLY_EDITED----------              ");
                        System.out.println();
                        break;  
                        
                    }

                case 7:
                    {
                       
                         System.out.println();
                        System.out.println("PREVIOUS_CAR_PRICE:"+car[i].CarPrice);
                        System.out.print("ENTER_MODIFIED_CAR_PRICE:");
                        car[i].CarPrice=Double.parseDouble(sc.nextLine());
                        System.out.println();
                        System.out.println("                     ------------CAR_PRICE_HAS_SUCCESSFULLY_EDITED----------              ");
                        System.out.println();
                        break;  
                    }

                case 8:       
                    {
                        Menu();
                        break;
                    }         
                    
                default:
                   {
                        System.out.println();
                        System.out.println("                     -------------------------[WRONG_INPUT]-------------------------      ");
                        System.err.println();

                    }    
               }
               if(temp==8) break;

            }
            break; 
            }
        case 10://--------------------------------------------------Back_Main_Menu-------------------------------------------------------------
        {
            Menu();
            break;
        }
        default:
            {
                System.out.println();
                System.out.println("********************************INVALID_CHOICE*****************************");
                System.out.println();
                Menu();
            }   
      }
      }
    

 }
    
}
