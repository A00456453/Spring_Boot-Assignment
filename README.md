I have created 3 APIs, one is used for retrieving hotel data, second one is used for saving the hotel data and the third API is used for hotel reservation.</br>

URL for adding the hotel details in the database:</br>
localhost:8080/hotel</br>
POST Method</br>
```
{ 
    "hotel_id": 4,
    "hotel_name": "raddison",
    "price": 1000000,
    "availability": 1
}
```

URL to display the hotel details in the database:</br>
localhost:8080/hotels</br>
GET Method</br>

URL for reservation of the hotels by passing checkin, checkout, hotelname and the guests_list including guest_name, gender where there will be the response of confirmation_number:</br>
localhost:8080/reservation</br>
POST Method</br>
```
{
    "checkin": "11-MAR-2022",
    "checkout": "11-MAR-2022",
    "hotel_name": "Luxuria",
    "guests_list": [
        {
            "guest_name": "Javal",
            "gender": "male"
        }
    ] 
}
```

  
