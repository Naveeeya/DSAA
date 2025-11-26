#!/bin/bash

# 1. Add all changes (including new Java files in 'codes')
git add .

# 2. Get current date for the commit message
current_date=$(date "+%Y-%m-%d %H:%M:%S")

# 3. Commit
git commit -m "DSA Progress: $current_date"

# 4. Push to GitHub
git push origin main

echo "✅ DSAA repo updated successfully!"
