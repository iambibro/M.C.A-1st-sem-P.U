            #include<iostream>
            using namespace std;
            void knapsack(int num,float weight[],float profit[],float capacity)
            {
                float x[20],totalp=0;
                int i,j,u;
                u=capacity;
                for(i=0;i<num;i++)
                {
                    if(weight[i]>u)
                        break;
                    else
                    {
                        x[i]=1.0;
                        totalp=totalp+profit[i];
                        u=u-weight[i];
                    }

                }
                if(i<num)
                {
                    x[i]=u/weight[i];
                }
                totalp=totalp+(x[i]*profit[i]);

                cout<<"the result vector is"<<endl;
                for(i=0;i<num;i++)
                    cout<<x[i] <<endl;
                cout<<"Maximum profit is"<<endl<<totalp;
            }


            int main()
            {

                float weight[20],profit[20],capacity;
                int num,i,j;
                float ratio[20],temp;

                cout<<"Enter the no od object"<<endl;
                cin>>num;
                cout<<"Enter weight and profit of each object"<<endl;
                for(i=0;i<num;i++)
                {
                    cin>>weight[i] >>profit[i];

                }
                cout<<"Enter the capcity of knapsack"<<endl;
                cin>>capacity;

                for(i=0;i<num;i++)
                {
                    ratio[i]=profit[i]/weight[i];
                }
                for(i=0;i<num;i++)
                {
                    for(j=i+1;j<num;j++)
                    {
                        if(ratio[i]<ratio[j])
                        {
                            temp=ratio[j];
                            ratio[j]=ratio[i];
                            ratio[i]=temp;

                            temp=weight[j];
                            weight[j]=weight[i];
                            weight[i]=temp;

                            temp=profit[i];
                            profit[i]=profit[j];
                            profit[j]=temp;
                        }
                    }
                }
                knapsack(num,weight,profit,capacity);
                return 0;
            }
