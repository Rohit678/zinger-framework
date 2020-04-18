package com.food.ordering.zinger.rowMapperLambda;

import com.food.ordering.zinger.model.PlaceModel;
import com.food.ordering.zinger.model.UserModel;
import com.food.ordering.zinger.model.UserPlaceModel;
import org.springframework.jdbc.core.RowMapper;

import static com.food.ordering.zinger.constant.Column.UserPlaceColumn.placeId;
import static com.food.ordering.zinger.constant.Column.UserPlaceColumn.userId;

public class UserPlaceRowMapperLambda {

    public static final RowMapper<UserPlaceModel> userPlaceRowMapperLambda = (rs, rownum) -> {
        UserPlaceModel userPlaceModel = new UserPlaceModel();

        UserModel userModel = new UserModel();
        userModel.setId(rs.getInt(userId));
        userPlaceModel.setUserModel(userModel);

        PlaceModel placeModel = new PlaceModel();
        placeModel.setId(rs.getInt(placeId));
        userPlaceModel.setPlaceModel(placeModel);

        return userPlaceModel;
    };
}
