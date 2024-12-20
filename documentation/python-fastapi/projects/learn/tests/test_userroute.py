# from fastapi.testclient import TestClient
# from sqlalchemy import create_engine
# from sqlalchemy.orm import sessionmaker

# import sys
# import os
# import json

# sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

# from models import Base
# from database import get_db
# from main import app

# SQLALCHEMY_DATABASE_URL = "sqlite:///./test.db"
# engine = create_engine(SQLALCHEMY_DATABASE_URL, connect_args={"check_same_thread": False})
# TestingSessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

# Base.metadata.create_all(bind=engine)

# def override_get_db():
# 	try:
# 		db = TestingSessionLocal()
# 		yield db
# 	finally:
# 		db.close()

# app.dependency_overrides[get_db] = override_get_db

# client = TestClient(app)

import json
from config import settings


def test_create_user(client):
    data = {"email": "test2@test.com", "password": "test2pass"}
    response = client.post("/user", json.dumps(data))
    assert response.status_code == 200
    assert response.json()["email"] == "test2@test.com"
    assert response.json()["is_active"] == True
